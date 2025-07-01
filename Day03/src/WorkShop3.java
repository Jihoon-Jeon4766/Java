import java.util.Iterator;
import java.util.Scanner;

public class WorkShop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String strNumber = scanner.next();
		
		int strLength = strNumber.length();
		
		int digit = 1;
		for (int i = 1; i < strLength; i++) {
			digit *= 10;
		}
		int intNumber = Integer.parseInt(strNumber);
		System.out.println(intNumber / digit * digit);
		
	}

}
