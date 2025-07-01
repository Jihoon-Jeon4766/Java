import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int randomNum = (int)(Math.random()*100)+1;
		while(true) {
			System.out.print("숫자를 맞혀보세요 (1~100): ");
			int num = scanner.nextInt();
			if(randomNum > num) {
				System.out.println("더 큰 숫자를 입력하세요.");
			}
			else if(randomNum < num){
				System.out.println("더 작은 숫자를 입력하세요.");
			}
			else {
				System.out.println("축하합니다! 정답입니다.");
				break;
			}
		}
	}

}
