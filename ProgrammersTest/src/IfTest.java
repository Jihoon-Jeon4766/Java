import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다.");
		}
		else if(num % 2 == 1){
			System.out.println(num + "은 홀수입니다.");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}

}
