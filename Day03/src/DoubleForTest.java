
public class DoubleForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.분리버전
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		// 2.합친버전
		for (int i = 1; i <= 10; i++) {
			if(i <= 5) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			}
			else {
			for (int j = 1; j <= 11 - i; j++) {
				System.out.print("#");
			}
			}
			System.out.println();
		}
		
		// 3.삼항연산자
		for (int i = 1; i <= 10; i++) {
		    int count = (i <= 5) ? i : 11 - i; 
		    for (int j = 1; j <= count; j++) {
		        System.out.print("#");
		    }
		    System.out.println();
		}

	}

}
