import java.util.Scanner;

public class FourTest {
    public static void main(String[] args) {
    	// 1.입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("피연산자1 입력 : ");
        int num1 = scanner.nextInt();
        System.out.print("연산자(+|-|*|/) 입력 : ");
        String operator = scanner.next();
        System.out.print("피연산자2 입력 : ");
        int num2 = scanner.nextInt();

        int result = 0;
        boolean isValid = true;

        // 2.연산
        if (operator.equals("+")) {
            result = num1 + num2;
        } 
        else if (operator.equals("-")) {
            result = num1 - num2;
        } 
        else if (operator.equals("*")) {
            result = num1 * num2;
        } 
        else if (operator.equals("/")) {
        	result = num1 / num2;
        } 
        else {
            System.out.println("연산자가 올바르지 않습니다.");
            isValid = false;
        }
        // 3.출력
        if (isValid) {
            System.out.println("결과 :" + num1 + " "+ operator + " " + num2 + " = " + result);
        }
         
    }
}
