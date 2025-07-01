// this()
// 공통된 작업을 특정 생성자의 정의하고, 다른 생성자들에서는 해당 작업을 작업이 정의된 생성자를
// this()를 이용해서 호출하면서 코드를 간결하게 처리할 수 있다.
// 손목보호대 클래스를 정의한다.
// 손목보호대에는 사이즈 속성과 메이커 속성이 있다.
// 생성자를 정의할때 사이즈의 기본값 M 이라고 한다.
// 메이커의 기본값은 나이키로 한다.


// 사용규칙
// 1.this()는 생성자의 첫번째 실행문으로 사용되어야 한다.
// 2.this()는 recursive call을 허용하지 않는다.


class WristGuard{
	String size;
	String maker;
	
	// 생성자 오버로딩
	public WristGuard() {
		// TODO Auto-generated constructor stub
		this("M","Nike");
	}
	public WristGuard(String size) {
		// TODO Auto-generated constructor stub
		this("Nike",size);
	}
	public WristGuard(String size, String maker) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.maker = maker;
	}
}

public class ThisConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
