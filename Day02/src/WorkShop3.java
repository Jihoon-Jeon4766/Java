import java.util.Scanner;

public class WorkShop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input name : ");
		String name = scanner.next();
		System.out.print("kor : ");
		int kor = scanner.nextInt();
		System.out.print("eng : ");
		int eng = scanner.nextInt();
		System.out.print("mat : ");
		int mat = scanner.nextInt();
		
		int total = kor + eng + mat;
		double avg = total/3.0;
		
		System.out.println("이름 : " + name);
		System.out.println("total점수 : " + total + "점");
		System.out.printf("avg점수 : %.1f ", avg );
	}

}
