// 예외종류
// 1. 런타임 예외
// 컴파일 타임에는 예외가 발생하지 않고, 런타임시에 발생
// 예외를 처리하지 않아도 컴파일 타임에는 빨간색 안 생긴다.
// 주로 개발자들이 논리적으로 프로그램을 잘 못 구현한 경우가 대부분이다.
// NullPointException, ArrayIndexOutOfBoundsException, ...
// UnCheckedException 이라고 함.

// 2. 일반 예외
// 개발자의 실수가 아니고 예외가 발생할 것이 예상되는 예외들
// FileNotFoundException, IOException, SQLException ,...
// 반드시 예외처리를 해주어야 컴파일타임에 예외가 발생하지 않는다.
// CheckedException 이라고 함.
public class ExceptionTest3 {
	void printData() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// throw : 임의적으로 예외를 발생 시킬때 사용하는 예약어
		// throw new RuntimeException();
		try {
			throw new Exception();	
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
