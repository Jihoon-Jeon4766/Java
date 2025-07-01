import java.util.Scanner;

public class WorkShop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("기본급 : ");
		int pay = scanner.nextInt();
		System.out.print("시간수당 : ");
		int o_time = scanner.nextInt();
		int tax = pay % 10;
		
		int t_pay = pay + o_time - tax;
		System.out.print("실수령액 : " + t_pay + "원");
	}

}
