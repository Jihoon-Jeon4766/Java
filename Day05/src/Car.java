// JVM에서 직접 시작시키는 클래스가 아니면 main 메소드가 없어도
// 클래스
// 객체에 대한 설계도
// 클래스의 기능을 사용하려면 클래스를 객체로 생성해서 메모리에 올려야한다.
public class Car {
	
	// 속성
	String company;
	String color;
	int displacement;
	int year;
	int velocity;
	int cylinderNumber;
	
	// 메소드
	// 메소드 구조
	// 리턴타입 메소드명(매개변수타입 매개변수명,....){
	// 실행문들;
	// ...
	// }
	// 메소드가 실행된 후 메소드를 호출한 쪽으로 반환할 값이 없으면
	// 리턴타입을 void로 지정한다.
	
	
	void run() {
		System.out.println("달린다.");
	}
	
	void stop() {
		System.out.println("멈춘다.");
	}
	
	// 오버로딩
	// 동일 클래스 안에서 매개변수를 다르게 정의하는 여러개의 메소드를 정의하는 것
	void speedUp() {
		velocity++;
	}
	
	void speedUp(int amount) {
		velocity += amount;
	}
	
	void speedDown() {
		velocity--;
	}
	
	void speedDown(int amount) {
		velocity -= amount;
	}
}
