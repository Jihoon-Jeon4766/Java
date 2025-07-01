package controller;

import java.util.Scanner;

import action.Action;

//클리이언트의전체요청을 받는 컨트롤러
public class IdolGroupController {

	public void processRequest(Action action, Scanner sanner) {
		// TODO Auto-generated method stub
		action.execute(sanner);
	}

}
