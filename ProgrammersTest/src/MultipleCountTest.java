import java.util.Scanner;

public class MultipleCountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		int count = 0;
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			if(i % 5 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("1부터 입력된 정수 " + num + "까지의 5의 배수의 개수 : " + count );
		System.out.println("1부터 입력된 정수 " + num + "까지의 5의 배수의 합 : " + sum );
	}

}
