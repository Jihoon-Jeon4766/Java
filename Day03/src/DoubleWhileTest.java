
/* 중청 while문 : while문 안에 또다른 while문이 사용되는 문장
 * 1번 while문에서는 2번 while문은 실행문1과 동일한 실행문으로 인식됨
	while(조건식) { // 1번 while 문
		실행문1:
		while(조건식) { // 2번 while문
		}
	}
*/
public class DoubleWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		while(i <= 10) {
			
			int j = 1;
			while(j <= 10) {
				System.out.println("i = " + i + ", j = " + j);
				j++;
			}
			
			i++;
			System.out.println();
		}

	}

}
