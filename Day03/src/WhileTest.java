// 조건식에 의해서 조건값이 true일때 실행문을 실행하는 반복문
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10까지 더하기
		int sum = 0;
		String expression = "";
		
		// while문에는 초기값을 지정하는 문법이 없다.
		int i = 1;
		while(i <= 10) {
			expression += (i == 1) ? i : "+" + i;
			sum += i;
			i++;
		}
		System.out.println(expression + " = " + sum);
		
		// while문은 조건을 먼저 비교하고 조건이 true일때 실행문을 실행하지만
		// do ~ while문은 실행문을 먼저 실행하고 조건을 비교한다.
		
		i = 1;
		expression = "";
		sum = 0;
		do {
			expression += (i == 1) ? i : "+" + i;
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println(expression + " = " + sum);
	}

}
