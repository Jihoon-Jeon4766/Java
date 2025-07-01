//반복문 -for
public class For_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for : 규칙적인 반복에 사용..
		// example : 1부터 10까지 1씩 증가하면서 10회 반복..

		// 1부터 10까지 더하기

		int sum =0;
		String expression =""; //표현..

		for(int i=1; i<=10; i++) {
			expression  += ((i == 1) ? i: "+" +i);
			sum += i;
		}
		System.out.println("1부터 10까지 더한값 =" + " "+ sum);
		System.out.println(expression +"="+ sum);

		// 짝수만 더하기..

		sum = 0;
		String expression1 ="";
		for(int i=1; i<=10; i++) {
			if(i % 2 ==0) {
				expression1  += ((i == 2) ? i: "+" +i);
				sum += i;   
			}   
		}
		System.out.println(expression1 +"="+ sum);

		// 다른 방법으로 짝수 더하기.. 
		sum = 0;
		String expression2 ="";
		for(int i=2; i<=10; i = i + 2) {
			expression2  += ((i == 2) ? i: "+" +i);
			sum += i;      
		}
		System.out.println(expression2 +"="+ sum);


		// 10부터 1까지 차례대로 더하기
		sum = 0;
		String expression3 ="";
		for(int i=10; i>=1; i--) {
			expression3  += ((i == 10) ? i: "+" +i);
			sum += i;      
		}
		System.out.println(expression3 +"="+ sum);

		System.out.println("for문으로 무한루프 돌리기...");

		int x=1;
		for(;;) {
			if(x>10) {
				break;
			}
			System.out.println(x);
			x++;
		}

	}

}
