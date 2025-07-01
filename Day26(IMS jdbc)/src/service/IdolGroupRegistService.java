package service;

import dto.IdolGroupDTO;
import ui.IdolGroupUI;

// 트렌젝션 처리 때문에
// Connection 객체는 Service 에서 생성하고 소멸시킴
// 계좌이체
// 하나의 Connection 에서 원본계좌에서 돈을 차감하는 작업을 DAO 클래스로 요청
// 대상 계좌에 돈을 증역시키는 작업을 DAO 클래스로 요청

import static db.JdbcUtil.*;

import java.sql.Connection;

import dao.IdolGroupDAO;
public class IdolGroupRegistService implements IdolGroupService{

	/*public boolean registIdolGroup(IdolGroupDTO newIdolGroupDTO) {
		// TODO Auto-generated method stub
		// 아이돌 그룹이름 중복체크
		
		boolean resistSuccess=true;
		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().
					equals(newIdolGroupDTO.getIdolGroupName())) {
				resistSuccess=false;
				break;
			}
		}
		
		// 등록작업
		if(resistSuccess) {
			IdolGroupDTO[] tempArray=IdolGroupUI.idolGroupArray;
			
			IdolGroupUI.idolGroupArray=new IdolGroupDTO[IdolGroupUI.idolGroupArray.length+1];
			
			// 기존 배열에 저장되었던 값들을 새로운 배열에 복사
			for (int i = 0; i < tempArray.length; i++) {
				IdolGroupUI.idolGroupArray[i]=tempArray[i];
			}
			
			// 기존배열보다 새로운 배열이 크기가 하나 더 크기때문에
			// for 문이 다 실행되고 나면 새로운 배열의 마지막 인덱스 영역에는 값이 저장되지 않는다.
			// 마지막 인덱스 영역에는 새로 등록할 아이돌그룹 객체를 저장하면 된다.
			IdolGroupUI.idolGroupArray[IdolGroupUI.idolGroupArray.length-1]
					= newIdolGroupDTO;
		}
		
		return resistSuccess;
	}
	*/
	
	public boolean registIdolGroup(IdolGroupDTO newIdolGroupDTO) {
		// TODO Auto-generated method stub
		boolean registSuccess = true;
		
		Connection con = getConnection();
		
		// SQL 구문을 실행하는 작업은 DAO(Data Access Object)에서 처리할
		// DAO 클래스에 정의되어 있는 메소드(기능)을 사용하려면
		// DAO 인스턴스의 레퍼런스를 얻어와야 한다.
		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		
		// DAO 클래스에서 SQL 작업을 하려면 Connection 을 DAO에 주입
		idolGroupDAO.setConnection(con);
		
		String idolGroupName = idolGroupDAO.selectIdolGroupName(newIdolGroupDTO.getIdolGroupName());
		
		if(idolGroupName != null) {
			registSuccess = false;
		}
		
		if(registSuccess) {
			int insertCount = idolGroupDAO.insertIdolGroup(changeDTOToVO(newIdolGroupDTO));
			if(insertCount <= 0) {
				registSuccess = false;
			}
		}
		
		close(con);
		
		return registSuccess;
	}
	 
}
