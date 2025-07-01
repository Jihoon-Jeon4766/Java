import java.util.Scanner;

public class GradeCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = scanner.nextInt();
		
		while(!(score >= 0 && score <= 100)) {
			System.out.println("잘못 입력했습니다");
			System.out.print("점수 : ");
			score = scanner.nextInt();
		}
		// 2.연산
		// 학점을 구해야함
		String grade = "";
		if(score >= 90) {
			grade = "A";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 70) {
			grade = "C";
		}
		else if(score >= 60) {
			grade = "D";
		}
		else{
			grade = "F";
		}
		
		// 3.출력
		System.out.println(grade);
		
		scanner.close();
	}
}
