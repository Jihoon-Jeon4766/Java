import java.util.Iterator;
import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("출력할 구구단 숫자를 입력하세요 (2~9): ");
		int num = scanner.nextInt();
		if(num >= 10 || num <= 1) {
			System.out.println("잘못된 입력입니다.");
		}
		else {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		}
	}

}
