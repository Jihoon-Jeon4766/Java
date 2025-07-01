
/* 문제3.사용자에게서 받은 문자열을 역순으로 화면에 출력하는 프로그램을 작성하여 보자. 예를 들어서 사용자가 				
	daegu를 입력받으면 ugead를 출력한다. */
import java.util.Scanner;

public class Daegu_ugead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("역순할 문자열 : ");
		String str = scanner.next();
		System.out.println(str.length());
		
		int length = str.length()-1;
	    while (length >= 0) {
	    	char target;
	        target = str.charAt(length);
	        System.out.print(target);
	        length--;
	    }
	    
	    for (int i = str.length() - 1; i >= 0  ; i--) {
			System.out.println(str.charAt(i));
		}
	}

}
