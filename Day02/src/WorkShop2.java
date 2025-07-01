import java.util.Scanner;

public class WorkShop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("부서 : ");
		String department = scanner.next();
		System.out.print("직위 : ");
		String position = scanner.next();
		System.out.print("급여 : ");
		int pay = scanner.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
		System.out.println("직위 : " + position);
		System.out.println("급여 : " + pay + "원");
	}

}
