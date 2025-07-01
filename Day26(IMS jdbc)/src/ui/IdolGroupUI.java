package ui;

import java.security.PublicKey;
import java.util.Scanner;
import action.Action;
import action.IdolGroupListAction;
import action.IdolGroupModifyAction;
import action.IdolGroupRegistAction;
import action.IdolGroupRemoveAction;
import action.IdolGroupSearchAction;
import action.IdolGroupViewAction;
import controller.IdolGroupController;
import dto.IdolGroupDTO;

// 화면(콘솔)
public class IdolGroupUI {

	public static IdolGroupDTO[] idolGroupArray = new IdolGroupDTO[0];
	// 나중에 이 배열 영역이 테이블 이라고 생각
	// IdolGroupDTO 객체 하나하나가 테이블에 저장되는 인스턴스 즉 래코드 라고 생각하면 됨

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean stop = false;
		Scanner sanner = new Scanner(System.in);
		sanner.useDelimiter(System.getProperty("line.separator"));
		IdolGroupController idolGroupController = new IdolGroupController();// ctrl+1 -->패키지 controller으로 바꾼다-->클래스가 만들어짐




		do {
			System.out.println("===========아이돌그룹=============");
			System.out.println("1.아이돌 그룹 등록");// C(Create)
			System.out.println("2.아이돌 그룹 목록보기");// R(Read)
			System.out.println("3.아이돌 그룹 정보보기");// R(Read)
			System.out.println("4.아이돌 그룹 정보수정");// U(Update)
			System.out.println("5.아이돌 그룹 정보삭제");// D(Delete)
			System.out.println("6.아이돌 그룹 검색");// R(Read)
			System.out.println("7.프로그램 종료");// R(Read)

			System.out.print("메뉴 번호 입력 : ");
			int menuNumber=sanner.nextInt();

			// 요청처리는 다형성을 사용해서 처리-인터페이스 사용

			Action action = null;


			switch (menuNumber) {
			case 1:
				action = new IdolGroupRegistAction(); // ctrl + 1 --> package action으로 바꾼다-->클래스가 만들어짐

				break;
			case 2:
				action = new IdolGroupListAction(); // ctrl + 1 --> package action으로 바꾼다-->클래스가 만들어짐

				break;
			case 3:
				action = new IdolGroupViewAction(); // ctrl + 1 --> package action으로 바꾼다-->클래스가 만들어짐

				break;
			case 4:
				action = new IdolGroupModifyAction(); // ctrl + 1 --> package action으로 바꾼다-->클래스가 만들어짐

				break;
			case 5:
				action = new IdolGroupRemoveAction(); // ctrl + 1 --> package action으로 바꾼다-->클래스가 만들어짐

				break;
			case 6:
				action = new IdolGroupSearchAction(); // ctrl + 1 --> package action으로 바꾼다-->클래스가 만들어짐

				break;

			default:
				break;
			}
			if(action != null) {
				idolGroupController.processRequest(action, sanner);
			}
		}
		while(!stop);
	}


}
