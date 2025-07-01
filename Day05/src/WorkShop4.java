/*While문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을
제공하는 코드를 작성해보세요. 이 프로그램을 실행시키면 다음과 같은 실행 결과가 나와야 합니다.*/
import java.util.Scanner;

public class WorkShop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		boolean run = true;

		int balance= 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-------------------");
			System.out.print("선택> ");

			int menuNum = scanner.nextInt();

			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				int i = scanner.nextInt();
				balance += i;
				break;
			case 2:
				System.out.print("출금액> ");
				int ii = scanner.nextInt();
				if(balance - ii < 0) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					balance -= ii;
				}
				break;
			case 3:
				System.out.println("잔고> "+ balance);
				break;
			case 4:
				run = false;
				break;

			default:
				System.out.println("잘못된 선택");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
