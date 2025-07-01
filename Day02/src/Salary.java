import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월급을 입력하시오: ");
		int salary = scanner.nextInt();

		int save = salary * 12 * 10;

		System.out.println("10년 동안의 저축액: " + save);

	}
}
