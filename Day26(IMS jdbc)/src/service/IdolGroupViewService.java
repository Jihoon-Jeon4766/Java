package service;

import static db.JdbcUtil.*;

import java.sql.Connection;

import dao.IdolGroupDAO;
import dto.IdolGroupDTO;
import ui.IdolGroupUI;
import vo.IdolGroupVO;

public class IdolGroupViewService implements IdolGroupService{

	/*public IdolGroupDTO getIdolGroupDTO(String idolGroupName) {
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
	}*/

	public IdolGroupDTO getIdolGroupDTO(String idolGroupName) {
		// TODO Auto-generated method stub
		IdolGroupDTO idolGroupDTO = null;

		Connection con = getConnection();

		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();

		idolGroupDAO.setConnection(con);

		IdolGroupVO idolGroupVO = idolGroupDAO.selectIdolGroup(idolGroupName);
		
		close(con);
		
		return changeVOToDTO(idolGroupVO);
	}

}
