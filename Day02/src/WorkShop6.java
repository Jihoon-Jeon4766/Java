import java.util.Scanner;

public class WorkShop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = scanner.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("입력오류!!");
		}
		else {
			System.out.println("점수 : " + score);
			System.out.println("정상처리됨!!");
		}
	}

}
