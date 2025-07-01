import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름을 입력하시오 : ");
		int r = scanner.nextInt();
		double area = r * r * 3.14;
		System.out.println("원의 면적은 : " + area);
	}

}
