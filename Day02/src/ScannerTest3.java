import java.util.Scanner;

public class ScannerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자는 객체를 생성하는 역할을 하는 단위
		// new 연산자에 의해서 단한번  호출되는 단위
		Scanner scanner = new Scanner(System.in);
		
		// indent 처리
		// cmd + a, cmd + i
		System.out.print("정수입력 1 : ");
		int number1 = scanner.nextInt();
		// nextInt() : 정수값만 읽어들임, enter 문자는 읽어들이지 않는다.
		
		System.out.println("number1 = " + number1);
	    scanner.nextLine();
		
		System.out.print("문자열 입력 1 : ");
		String str1 = scanner.nextLine();
		// nextLine() : 입력한 문자열과 enter 문자까지 읽는다.
		System.out.println(str1 + " 문자");
		
		System.out.print("정수입력 2 : ");
		int number2 = scanner.nextInt();
		System.out.println(number2 + " 두번째 숫자 ");
		
		System.out.print("문자열 입력 2 : ");
		String str2 = scanner.next();
		// next() : 입력한 문자열만 읽는다.
		System.out.println(str2 + " 문자");
		
	}
}
