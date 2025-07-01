import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바의 배열의 불편한점
		// 배열의 크기는 한번 정해지면 변경할 수 없다.
		// 십진수를 입력받아서 이진수로 변환
		// 1.숫자를 입력받는다. 십진수 :
		// 2.결과값을 아래와 출력
		// 0000 0000 0000 0011
		// 배열을 사용해서 해결
		// int[] array = new int[16]

		Scanner scanner = new Scanner(System.in);

		System.out.print("십진수를 입력하세요: ");
		int num = scanner.nextInt(); 

		int[] array = new int[16];

		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = num % 2;
			num = num / 2;
		}
		
		System.out.print("이진수 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if((i + 1) % 4 == 0) {
				System.out.print(" ");
			}
		}
	}
}

