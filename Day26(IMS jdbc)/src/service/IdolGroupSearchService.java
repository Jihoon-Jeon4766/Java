package service;

import static db.JdbcUtil.close;
import static db.JdbcUtil.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import dao.IdolGroupDAO;
import dto.IdolGroupDTO;
import ui.IdolGroupUI;
import vo.IdolGroupVO;

public class IdolGroupSearchService implements IdolGroupService{

	/*public IdolGroupDTO searchIdolGroupByName(String idolGroupName) {
		// TODO Auto-generated method stub
		IdolGroupDTO idolGroupDTO = null;

		for (int i = 0; i < IdolGroupUI.idolGroupArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getIdolGroupName().
					equals(idolGroupName)) {
				idolGroupDTO = IdolGroupUI.idolGroupArray[i];
				break;
			}
		}

		return idolGroupDTO;
	}

	public IdolGroupDTO[] searchIdolGroupArrayByGeneration(String generation) {
		// TODO Auto-generated method stub
		//검색하는 나이대와 동일한 나이대를 가진 아이돌 그룹의 개수가 일정하지 않다.
		//찾아진 아이돌 그룹 객체를 배열에 담아서 반환할때 배열의 크기는 검색된 아이돌 그룹의 개수와 정확히 일치해야 함
		int count = 0;

		//배열에서 검색하는 나이대와 동일한 나이대의 아이돌 그룹 객체를 찾아서 해당 객체들을 임시적으로 저장할 배열 객체를 생성.
		IdolGroupDTO[] tempArray = new IdolGroupDTO[IdolGroupUI.idolGroupArray.length];

		//배열에서 검색하는 나이대와 동일한 나이대를 가진 아이돌 그룹 객체를 찾아서 tempArray 배열에 저장하고
		//검색된 아이돌 그룹 객체의 개수를 계산하겠습니다.

		for (int i = 0; i < tempArray.length; i++) {
			if(IdolGroupUI.idolGroupArray[i].getGeneration() == Integer.parseInt(generation)) {
				tempArray[count++] = IdolGroupUI.idolGroupArray[i];
			}
		}

		//검색된 아이돌 그룹의 개수 (count) 의 크기로 최종 반환할 배열객체를 생성하고
		//tempArray	배열에 임시 저장된 아이돌 그룹 객체들을 최종 반환할 배열에 복사하고
		//최종 반환할 배열객체를 반환
	    IdolGroupDTO[] searchedArray = new IdolGroupDTO[count];

	    for (int i = 0; i < count; i++) {
	    	searchedArray[i] = tempArray[i];
		}

		return searchedArray;
	}*/
	public IdolGroupDTO searchIdolGroupByName(String idolGroupName) {
		// TODO Auto-generated method stub
		Connection con = getConnection();

		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();

		idolGroupDAO.setConnection(con);

		IdolGroupVO oldIdolGroupVO = idolGroupDAO.selectIdolGroup(idolGroupName);

		close(con);

		return changeVOToDTO(oldIdolGroupVO);
	}

	public ArrayList<IdolGroupDTO> searchIdolGroupArrayByGeneration(String generation) {
		// TODO Auto-generated method stub
		ArrayList<IdolGroupVO> idolGroupList = new ArrayList<IdolGroupVO>();

		Connection con = getConnection();

		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();

		idolGroupDAO.setConnection(con);

		idolGroupList = idolGroupDAO.selectIdolGroupList(generation);

		ArrayList<IdolGroupDTO> idolGroupDTOList = new ArrayList<IdolGroupDTO>();

		for (int i = 0; i < idolGroupList.size(); i++) {
			idolGroupDTOList.add(changeVOToDTO(idolGroupList.get(i)));
		}

		close(con);

		return idolGroupDTOList;

	}
}














