// break;
import java.util.Scanner;

public class GoodProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("당신이 존경하는 교수님 이름을 입력하세요 : ");
			String professor = scanner.next();
			if(professor.equals("오정원")) {
				System.out.println("참 좋은 학생입니다.");
				break;
			}
			else {
				System.out.println("헉, 다시 한번 생각해보세요.");
			}
		}
		
	}
}
