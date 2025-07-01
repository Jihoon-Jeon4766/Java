
public class ExceptionTest2 {
	public void exceptionMethod(String[] args) {
		try {
			int number = Integer.parseInt(args[0]);
			int result = 10 / number;
			return;
			}
			catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");	
			return;
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인자를 전달하세요");
				return;
			}
			catch (Exception e) {
				System.out.println("숫자를 입력하세요");
			}
			finally {				
				System.out.println("반드시 실행되어야 하는 작업");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest2 exceptionTest2 = new ExceptionTest2();
		exceptionTest2.exceptionMethod(args);
	}

}
