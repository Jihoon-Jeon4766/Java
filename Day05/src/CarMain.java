
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 타입이 클래스 타입인 변수들은 객체의 레퍼런스값이 저장되는 것이므로 
		// 이런 변수들을 레퍼런스 변수라고 함
		Car myCar = new Car();
		
		myCar.year = 2025;
		myCar.company = "현대";
		
		System.out.println("myCar.company = " + myCar.company);
		System.out.println("myCar.year = " + myCar.year);
		
		// 메소드
		System.out.println("메소드 호출 전 velocity 값 : " + myCar.velocity);
		myCar.speedUp();
		System.out.println("myCar.speedUp(); 메소드 호출 후 velocity 값 : " + myCar.velocity);
		myCar.speedUp(100);
		System.out.println("myCar.speedUp(100); 메소드 호출 후 velocity 값 : " + myCar.velocity);
		myCar.speedDown();
		System.out.println("myCar.speedDown(); 메소드 호출 후 velocity 값 : " + myCar.velocity);
		myCar.speedDown(100);
		System.out.println("myCar.speedDown(100); 메소드 호출 후 velocity 값 : " + myCar.velocity);
	}

}
