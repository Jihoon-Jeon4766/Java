package action;

import java.util.Scanner;

import dto.IdolGroupDTO;
import service.IdolGroupViewService;
import util.ConsoleUtil;

public class IdolGroupViewAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		
		//1. 상세 내용을 볼 아이돌 그룹의 이름을 얻어오기
		//
		String idolGroupName = consoleUtil.getIdolGroupName("상세내용을 볼 아이돌그룹 이름 : ",scanner);
		
		//2. 사용자가 입력한 아이돌 그룹의 상세정보를 얻어와야 함
		// 이 작업은 비지니스 로직임
		//즉, Service 클래스에 구현되어야 함
		IdolGroupViewService idolGroupViewService
		= new IdolGroupViewService();
		
		
		//3. 사용자가 입력한 이름의 아이돌 그룹 정보를 얻어오는 메소드 호출
		//리턴 받는 데이터는 하나의 아이돌 그룹 정보(IdolGroupDTO)
		IdolGroupDTO idolGroupDTO = idolGroupViewService.getIdolGroupDTO(idolGroupName);
		
		//4. 얻어온 아이돌 그룹 정보를 사용자에게 응답해 줌
		consoleUtil.printIdolGroupDTO(idolGroupDTO);
		
	}

}












