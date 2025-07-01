
public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그램을 실행하는 중 에러가 발생하면 기본 동작은 프로그램이 더 이상 실행되지 않고
		// 종료됨
		System.out.println("프로그램 동작 중.");
		
		try {
		int number = Integer.parseInt(args[0]);
		int result = 10 / number;
		}
		catch(ArithmeticException e) {
		System.out.println("0으로 나누면 안됨");	
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 전달하세요");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}
		System.out.println("예외 발생 후 작업");
	}

}
