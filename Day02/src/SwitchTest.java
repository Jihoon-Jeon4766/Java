import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("====회원관리====");
		System.out.println("1.회원등록");	// C(Create)
		System.out.println("2.회원목록보기"); // R(Read)
		System.out.println("3.회원정보수정"); // U(Update)
		System.out.println("4.회원정보삭제"); // D(Delete)
		
		System.out.print("메뉴입력 : ");
		int menuNumber = scanner.nextInt();
		
		switch (menuNumber) {
		case 1:
			System.out.println("회원등록 처리");
			break;
		case 2:
			System.out.println("회원목록 처리");
			break;
		case 3:
			System.out.println("회원정보수정 처리");
			break;
		case 4:
			System.out.println("회원정보삭제 처리");
			break;

		default:
			System.out.println("잘못 선택했습니다.");
			break;
		}
	}

}
