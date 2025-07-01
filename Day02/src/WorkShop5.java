import java.util.Scanner;

public class WorkShop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a : ");
		int a = scanner.nextInt();
		System.out.print("Input b : ");
		int b = scanner.nextInt();
		
		int result = a > b ? a : b;
		System.out.println("큰수 : " + result);
	}

}
