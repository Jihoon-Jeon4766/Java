import java.util.Scanner;

public class CalculateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Calculate calc = new Calculate();
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("연산할 값 : ");
	       int num = scanner.nextInt();
	       System.out.println("factorial : "+ calc.getFactorial(num));
	       System.out.println("power : " + calc.getPower(num));
	}

}
