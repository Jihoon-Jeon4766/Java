import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("시간을 입력하시오 : ");
		int time = scanner.nextInt();
		int pay = 5000;
		double totalPay = 0;
		
		if(time <= 8) {
			totalPay = time * pay;
		}
		else {
			totalPay = 8 * pay + (time - 8) * pay * 1.5;
		}
		System.out.println("임금은" + totalPay + "입니다.");
		
	}

}
