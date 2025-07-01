import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단순 if문
		// 조건식이 true면 명령문을 실행하고, 조건식이 false이면 명령문을 실행하지 않는 문장
		// if(true나 false를 반환하는 조건식){
		// 조건식이 true를 반활할 경우 실행할 명령
		// }


		Scanner scanner = new Scanner(System.in);
		/*System.out.print("숫자입력 : ");
		int number = scanner.nextInt();*/

		// if문 실행문이 하나일때
		// "{}"는 생략할 수 있다.
		// 코드 가독성을 고려해서 권장하지는 않는다.
		// if(number > 10) { // {
		// System.out.println("숫자가 10보다 크다.");
		// }
		// }

		// if ~ else문 
		// 조건식이 true일때 실행될 명령문과 조건식이 false일때 실행될 명령문
		// 을 모두 지정할 수 있는 문장
		// if(true나 false를 반환하는 조건식){
		// 조건식이 true를 반활할 경우 실행할 명령
		// }
		// else{
		// 조건식이 false를 반활할 경우 실행할 명령
		// }
		
		/*if(number > 10) {
			System.out.println("숫자가 10보다 크다.");
		}
		else {
			System.out.println("숫자가 10보다 크지 않다.");
		}*/

		// 다중 if문
		// 조건식이 여러 개인 문장
		
		// if(조건식1){
		// 조건식1이 true를 반환할 경우 실행할 명령
		// }
		// else if(조건식2){
		// 조건식1이 false이고, 조건식2가 true를 반환할 경우 실행할 명령
		// }
		// ...
		// else{
		// 앞에 나열된 조건식들이 모두 false를 반환할때 실행될 명령
		
		/*if(number > 10) {
			System.out.println("숫자가 10보다 크다.");
		}
		else if(number > 8){
			System.out.println("숫자가 10보다 크지 않고 8보다 크다.");
		}
		else {
			System.out.println("숫자가 10보다 크지 않고 8보다 크지 않다.");
		}*/
		
		// 중첩 if문
		// if문 안에 다른 if문이 오는 문장
		// if(){
			// if(){
				// 바깥쪽 if문의 조건도 만족하면서, 안쪽 if문의 조건도 만족할때
				// 실행되는 명령
			// }
		// }
		
		// 학점 구하기
		System.out.print("점수입력 : ");
		int score = scanner.nextInt();
		
		String grade = "";
		if(score >= 90) {
			grade = "A";
			
			if(score >= 95) {
				grade += "+";
			}
		}
		else if(score >= 80) {
			grade = "B";
			
			if(score >= 85) {
				grade += "+";
			}
		}
		System.out.println("당신의 학점은 : " + grade);
	}

}
