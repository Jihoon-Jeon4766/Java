package service;

import dto.IdolGroupDTO;
import vo.IdolGroupVO;

public interface IdolGroupService {
	public default IdolGroupVO changeDTOToVO(IdolGroupDTO idolGroupDTO) {
		return new IdolGroupVO(
				idolGroupDTO.getIdolGroupName(), 
				idolGroupDTO.getCompany(), 
				idolGroupDTO.getGender(), 
				idolGroupDTO.getGenre(), 
				idolGroupDTO.getYear(), 
				idolGroupDTO.getSong(), 
				idolGroupDTO.getGeneration());
	}
	
	public default IdolGroupDTO changeVOToDTO(IdolGroupVO idolGroupVO) {
		IdolGroupDTO idolGroupDTO = new IdolGroupDTO();
		idolGroupDTO.setIdolGroupName(idolGroupVO.getIdolGroupName());
		idolGroupDTO.setCompany(idolGroupVO.getCompany());
		idolGroupDTO.setGender(idolGroupVO.getGender());
		idolGroupDTO.setGeneration(idolGroupVO.getGeneration());
		idolGroupDTO.setGenre(idolGroupVO.getGenre());
		idolGroupDTO.setSong(idolGroupVO.getSong());
		idolGroupDTO.setYear(idolGroupVO.getYear());;
		
		return idolGroupDTO;
	}
}
