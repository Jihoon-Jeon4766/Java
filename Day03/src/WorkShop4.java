import java.util.Scanner;

public class WorkShop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		System.out.print("문자를 입력하세요: ");
		char ch = scanner.next().charAt(0); 

		boolean b = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'));

		System.out.println("결과: " + b);

		scanner.close(); 
	}
}