import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 별 개수를 입력하세요 (1~5): ");
		int star = scanner.nextInt();
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
