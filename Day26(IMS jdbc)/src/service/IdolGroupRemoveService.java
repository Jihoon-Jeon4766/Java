package service;

import static db.JdbcUtil.*;

import java.sql.Connection;

import dao.IdolGroupDAO;
import dto.IdolGroupDTO;
import ui.IdolGroupUI;
import vo.IdolGroupVO;

public class IdolGroupRemoveService {

	/*public boolean removeIdolGroup(String idolGroupNameForRemove) {
		// TODO Auto-generated method stub
		
		boolean removeSuccess = false;
		
		//1. 삭제할 대상 아이돌 그룹 객체를 저장하고 있는 배열의 인덱스 위치를 찾는다.
		int index = -1;
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().
					equals(idolGroupNameForRemove)) {
				index = i;
				break;
			}
		}
		
		//2.찾은 index 값이 -1 이아니면
		//즉, 삭제할 아이돌 그룹 정보가 배열에 있으면
		//삭제 작업 수행
		if(index != -1) {
			
			//2-1. 기존 배열을 백업
			IdolGroupDTO[] tempArray = IdolGroupUI.idolGroupArray;
			
			//2-2. 기존 배열의 크기보다 하나가 작은 배열 객체 생성
			IdolGroupUI.idolGroupArray = new IdolGroupDTO[tempArray.length - 1];
			
			//2-3. 기존 배열에 저장된 아이돌 그룹 객체를 삭제할 아이돌 그룹 객체만 제외하고 
			//새로운 배열객체에 복사
			for (int i = 0; i < tempArray.length; i++) {
				if(i < index) {
					IdolGroupUI.idolGroupArray[i] = tempArray[i];
				}
				else if(i > index) {
					IdolGroupUI.idolGroupArray[i-1] = tempArray[i];
				}
			}
			
			removeSuccess = true;
		}
		return removeSuccess;
	}*/
	
	public boolean removeIdolGroup(String idolGroupNameForRemove) {
		// TODO Auto-generated method stub
		boolean removeSuccess = false;
		
		Connection con = getConnection();

		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();

		idolGroupDAO.setConnection(con);
		
		int deleteCount = idolGroupDAO.deleteIdolGroup(idolGroupNameForRemove);
		
		if(deleteCount > 0) {
			removeSuccess = true;
		}
		
		close(con);
		return removeSuccess;
	}

}












