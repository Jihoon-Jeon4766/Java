package service;

import java.sql.Connection;
import static db.JdbcUtil.*;

import dao.IdolGroupDAO;
import dto.IdolGroupDTO;
import ui.IdolGroupUI;
import vo.IdolGroupVO;

public class IdolGroupModifyService implements IdolGroupService {

	/*public IdolGroupDTO getOldIdolGroupDTO(String idolGroupNameForModify) {
		// TODO Auto-generated method stub
		IdolGroupDTO oldIdolGroupDTO = null;

		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().
					equals(idolGroupNameForModify)) {
				oldIdolGroupDTO = IdolGroupUI.idolGroupArray[i];
				break;
			}
		}

		return oldIdolGroupDTO;
	}

	public boolean modifyIdolGroup(IdolGroupDTO newIdolGroupDTO) {
		// TODO Auto-generated method stub
		boolean modifySuccess = false;
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().
					equals(newIdolGroupDTO.getIdolGroupName())) {
				IdolGroupUI.idolGroupArray[i] = newIdolGroupDTO;
				modifySuccess = true;
				break;
			}
		}
		return modifySuccess;
	}*/


	public IdolGroupDTO getOldIdolGroupDTO(String idolGroupNameForModify) {
		// 트랜젝션
		// 데이터를 조작하는 하나의 단위
		
		// 트랜젝션 처리
		// 여러개의 데이터를 조작하는 작업을 하나의 단위로 묶어서 트랜젝션 중에 있는 작업이
		// 하나라도 실패하면 전체를 롤백시키는 기능
		
		// ex)계좌이체 메소드
		// 하나의 Connection 가지고
		// DAO 클래스의
		// 1. 원본 계좌의 잔액을 차감하는 Update 작업을 하는 메소드
		// 2. 대상계좌의 잔액을 증가시키는 Update 작업을 하는 메소드
		// 1,2 작업이 모두 성공했을때만 계좌이체 작업을 완료 (commit) 시키고
		// 두 작업 중 하나라도 실패하면 전체 작업을 취소(rollback) 시킨다.
		
		Connection con = getConnection();

		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		
		idolGroupDAO.setConnection(con);

		IdolGroupVO oldIdolGroupVO = idolGroupDAO.selectIdolGroup(idolGroupNameForModify);

		close(con);

		return changeVOToDTO(oldIdolGroupVO);
	}

	public boolean modifyIdolGroup(IdolGroupDTO newIdolGroupDTO) {
		boolean modifySuccess = false;
		Connection con = getConnection();

		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		idolGroupDAO.setConnection(con);

		int updateCount = idolGroupDAO.updateIdolGroup(changeDTOToVO(newIdolGroupDTO));

		if (updateCount > 0) {
			modifySuccess = true;
		} 
		
		close(con);
		return modifySuccess;
	}
}

