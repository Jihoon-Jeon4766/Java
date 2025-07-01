package action;

import java.util.Scanner;

import service.IdolGroupRemoveService;
import util.ConsoleUtil;

public class IdolGroupRemoveAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		// TODO Auto-generated method stub
		//1. 삭제할 아이돌 그룹의 이름을 사용자로부터 입력 받기
		ConsoleUtil consoleUtil = new ConsoleUtil();
		String idolGroupNameForRemove = consoleUtil.getIdolGroupName("삭제할 아이돌 그룹 이름 : ", scanner);
		
		//2.입력받은 아이돌 그룹 이름을 가지고 있는 아이돌 그룹을 삭제
		IdolGroupRemoveService idolGroupRemoveService
		= new IdolGroupRemoveService();
		boolean removeSuccess = idolGroupRemoveService.removeIdolGroup(idolGroupNameForRemove);
		
		//3. 삭제 성공 여부에 따라서 응답 메시지 출력
		if(removeSuccess) {
			consoleUtil.printRemoveSuccessMessage(idolGroupNameForRemove);
		}
		else {
			consoleUtil.printRemoveFailMessage(idolGroupNameForRemove);
		}

	}

}
