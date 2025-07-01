import java.util.Scanner;

public class WorkShop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------");
			System.out.println("1.에코 | 2.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");
			
			String menuNum = scanner.nextLine();
			
			switch (menuNum) {
			case "1":
				System.out.print("입력>");
				String input = scanner.nextLine();
				System.out.println("에코>" + input);
				break;
			case "2":
				run = false;
				break;

			default:
				break;
			}
			
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}

}
