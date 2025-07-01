import java.util.Scanner;

public class DoWhileNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		boolean stop = false;
		do {
			System.out.println("숫자를 입력하세요.(0입력시 종료)");
			int num = scanner.nextInt();
			if(num != 0) {
			result += num;
			}
			else {
				stop = true;
			}
		} while (!stop);
		System.out.println("총합계는 : " + result);
	}

}
