// 연산자
import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 산술연산자
		// % : 나머지 구하는 연산자
		// Scanner scanner = new Scanner(System.in);
		// System.out.print("숫자 1 : ");
		// int number1 = scanner.nextInt();
		//		
		// System.out.print("숫자 2 : ");
		// int number2 = scanner.nextInt();
		//		
		// System.out.println(number1 + " % " + number2 + " = " 
		// + (number1 % number2));
		
		// 복합연산자
		// += : 변수에 피연산자값을 더한 후 변수에 연산한 결과값을 할당
		int x = 5;
		System.out.println("x = " + x);
		x += 5;
		// x = x + 5
		System.out.println("x += 5 : " + x);
		
		// 비교연산자
		// != : 같지않다.
		x = 5;
		int y = 10;
		System.out.println(x + " != " + y + " ===> " + (x != y));
		
		// 논리연산자
		System.out.println("true && true ===> " + (true && true));
		System.out.println("true && false ===> " + (true && false));
		
		System.out.println("true || true ===> " + (true || true));
		System.out.println("true || false ===> " + (true || false));
		System.out.println("false || false ===> " + (false || false));
		
		System.out.println("!false ===> " + (!false));
		System.out.println("!true ===> " + (!true));
		
		// 짧은연산(Short Circuit)
		// 앞의 피연산자 값으로 논리연산의 결과를 알 수 있으면
		// 뒤의 피연산자값을 연산하지 않고 연산의 결과를 반환
		System.out.println(false && true);
		System.out.println(true || true);
		
		// 비트연산자
		// 암호화 같은 경우처럼 특정한 숫자를 일정한 패턴으로 생성해 낼때
		x = 3;
		// 00000000 00000000 00000000 00000011
		y = 4;
		// 00000000 00000000 00000000 00000100
		
		int result = x & y;
		// 00000000 00000000 00000000 00000000
		
		System.out.println("3 & 4 = " + result);
		
		// 비트 연산자는 논리연산자로도 사용된다.
		System.out.println("true & true ===> " + (true & true));
		System.out.println("true & false ===> " + (true & false));
		
		System.out.println("true | true ===> " + (true | true));
		System.out.println("true | false ===> " + (true | false));
		System.out.println("false | false ===> " + (false | false));
		
		// 비트연산자는 짧은연산을 지원하지 않는다.
		System.out.println(false & true);
		System.out.println(true | true);
		
		// 시프트연산자
		x = 2;
		x = x << 2; // 2자리 만큼 왼쪽으로 비트 이동
		// 원래 값에 2의 비트이동의 제곱을 곱하는 연산
		System.out.println("2 << 2 : " + x);
		
		x = x >> 1;
		// 1자리 만큼 왼쪽으로 비트 이동
		// 원래 값에 2의 비트이동의 제곱을 나누는 연산
		System.out.println("8 >> 1 : " + x);
		
		// 우측시프트
		// >> (부호가 있는 우측시프트)
		// 10000000 00000000 00000000 00000110 >>> 1
		// 11000000 00000000 00000000 00000110 
		// >> (부호가 없는 우측시프트)
		// 10000000 00000000 00000000 00000110 >>> 1
		// 01000000 00000000 00000000 00000011 
		
		// 증감연산자
		// 증감연산자가 다른 연산자 앞에 오면 증감연산자를 먼저 연산하고 다른
		// 연산을 한다.
		x = 5;
		y = ++x;
		System.out.println("x = " + x + ", y = " + y);
		
		// 증감연산자가 다른 연산자 앞에 오면 다른연산자를 먼저 연산하고 증감
		// 연산을 한다.
		x = 5;
		y = x++;
		System.out.println("x = " + x + ", y = " + y);
		
		// 삼항연산자
		// 절대값 구하기
		x = -10;
		int absX = x >= 0 ? x : -x;
		System.out.println("absX = " + absX);
		
	}

}
