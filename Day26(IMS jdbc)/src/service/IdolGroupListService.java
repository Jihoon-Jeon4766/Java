package service;

import java.sql.Connection;
import java.util.ArrayList;

import dao.IdolGroupDAO;
import dto.IdolGroupDTO;
import ui.IdolGroupUI;
import vo.IdolGroupVO;

import static db.JdbcUtil.*;

public class IdolGroupListService implements IdolGroupService{

	/*public IdolGroupDTO[] getIdolGroupArray() {
		// TODO Auto-generated method stub


		return IdolGroupUI.idolGroupArray;
	}*/

	public ArrayList<IdolGroupDTO> getIdolGroupList() {
		// TODO Auto-generated method stub
		Connection con = getConnection();

		// SQL 구문을 실행하는 작업은 DAO(Data Access Object)에서 처리할
		// DAO 클래스에 정의되어 있는 메소드(기능)을 사용하려면
		// DAO 인스턴스의 레퍼런스를 얻어와야 한다.
		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();

		// DAO 클래스에서 SQL 작업을 하려면 Connection 을 DAO에 주입
		idolGroupDAO.setConnection(con);
		
		ArrayList<IdolGroupVO> idolGroupList = idolGroupDAO.selectIdolGroupList();
		
		// 데이터베이스에서 조회한 데이터를
		// 클라이언트 쪽으로 전달하려면 VO 타입을 DTO 타입으로 변환해서 전달해야 함
		
		ArrayList<IdolGroupDTO> idolGroupDTOList = new ArrayList<IdolGroupDTO>();
		
		for (int i = 0; i < idolGroupList.size(); i++) {
			idolGroupDTOList.add(changeVOToDTO(idolGroupList.get(i)));
		}
		
		close(con);
		
		return idolGroupDTOList;
	}

}
