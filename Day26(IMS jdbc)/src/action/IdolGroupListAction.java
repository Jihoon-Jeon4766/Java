package action;

import java.util.ArrayList;
import java.util.Scanner;

import dto.IdolGroupDTO;
import service.IdolGroupListService;
import util.ConsoleUtil;

public class IdolGroupListAction implements Action {

	@Override
	public void execute(Scanner scanner) {
		// TODO Auto-generated method stub

		IdolGroupListService idolGroupListService
		=new IdolGroupListService();
		
		// IdolGroupDTO[] idolGroupArray=idolGroupListService.getIdolGroupArray();
		
		ArrayList<IdolGroupDTO> idolGroupList = idolGroupListService.getIdolGroupList();
		
		ConsoleUtil consoleUtil=new ConsoleUtil();
		consoleUtil.printIdolGroupList(idolGroupList);
	}

}
