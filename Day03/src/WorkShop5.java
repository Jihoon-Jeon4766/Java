import java.util.Scanner;

public class WorkShop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input name : ");
		String name = scanner.next();
		System.out.print("Input gender : ");
		String gender = scanner.next();
		System.out.print("Input age : ");
		int age = scanner.nextInt();
		System.out.print("Input tall : ");
		double tall = scanner.nextDouble();
		gender = gender == "M"  ? "남자" : "여자";
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.printf("신장 : %.1f\n", tall);
	}

}
