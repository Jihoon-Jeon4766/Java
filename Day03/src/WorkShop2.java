import java.util.Scanner;

public class WorkShop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scanner.nextInt();
		System.out.println(num % 2 == 0 ? "양수" : "음수");
	}

}
