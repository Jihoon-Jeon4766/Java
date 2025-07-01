// 자바의 변수 종류
// 자바는 영역("{}")으로 묶인 곳에서는 어디서든지 변수를 선언할 수 있다.
// 변수가 선언된 위치(영역)에 따라서 변수 종류가 결정됨
public class VarKindTest {
	int memberVar;
	// 멤버변수(인스턴스변수)
	// 초기화 시점 : new 연산자로 객체를 생성할때 각 객체마다 멤버변수가 초기화됨 --2
	// 멤버변수는 선언할때 값을 할당하지 않으면 자동으로 해당 데이터타입의 기본값으로 초기화 됨 --1
	
	static int staticVar;
	// 스테이틱변수 (클래스변수) : 변수든 메소드든 static 이 지정되면 레벨이 객체 레벨이 아니고
	// 클래스에 속하는 레벨로 올라감
	// 따라서, 클래스 변수는 객체를 생성하지 않아도 클래스 이름으로 바로 사용 가능하다. --3
	// 클래스변수는 선언할때 값을 할당하지 않으면 자동으로 해당 데이터타입의 기본값으로 초기화 됨
	// 해당 클래스를 사용하는 모든 객체에서 공유됨 --4
	// 따라서, 스테이틱 변수는 값을 공유하는 용도로 사용된다.
	
	void method1(int paramVar1, int paramVar2) {
		// 파라미터 변수 : 메소드를 호출하는 쪽에서 전달해주는 값을 저장하는 변수
		// 특성은 로컬변수와 동일하다.
	}
	
	// 자바에서 사용되는 메소드 종류
	// 1. 멤버메소드(인스턴스메소드)
	// 클래스 객체를 생성한 후 사용할 수 있다. scanner.next() --5
	
	void instanceMethod1() {
		// 인스턴스 메소드 안에서 static 변수를 사용할 수 있을까요?
		// 사용할 수 있음
		int x = staticVar;
		int y = memberVar;
		
		instanceMethod2();
	}
	
	void instanceMethod2() {
		
	}
	
	// 2. 스테이틱메소드(클래스메소드)
	// 객체를 생성하지 않고 클래스 이름으로 바로 호출(사용)할 수 있는 메소드 --6
	// Math.random()
	// out.println()
	static void staticMethod1() {
		// static 메소드 안에서 instance 변수를 사용할 수 있을까요?
//		int x = memberVar;
		VarKindTest vt = new VarKindTest();
		int x = vt.memberVar;
		
//		instanceMethod1();
		int y = staticVar;
		staticMethod2();
	}
	static void staticMethod2() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --1
		System.out.println("1.");
		VarKindTest varKindTest1 = new VarKindTest();
		System.out.println("varKindTest1.memberVar = " + varKindTest1.memberVar);
		
		// --2
		System.out.println("2.");
		VarKindTest varKindTest2 = new VarKindTest();
		System.out.println("varKindTest2.memberVar = " + varKindTest2.memberVar);
		varKindTest2.memberVar = 100;
		System.out.println("varKindTest2.memberVar = 100;");
		System.out.println("varKindTest1.memberVar = " + varKindTest1.memberVar);
		System.out.println("varKindTest2.memberVar = " + varKindTest2.memberVar);
		
		// --3.
		System.out.println("3.");
		System.out.println("VarKindTest.staticVar = " + VarKindTest.staticVar);
		
		// --4.
		System.out.println("4.");
		VarKindTest.staticVar = 100;
		System.out.println("VarKindTest.staticVar = 100;");
		System.out.println("VarKindTest.staticVar = " + VarKindTest.staticVar);
		System.out.println("varKindTest1.staticVar = " + varKindTest1.staticVar);
		System.out.println("varKindTest2.staticVar = " + varKindTest2.staticVar);
		
		
		int localVar;
		// 로컬변수(지역변수)
		// 변수를 선언할때 값을 초기화 하지 않으면, 사용할때 컴파일 오류 발생함.
		// 사용하기 전에 반드시 초기화 해야 함
		
		int x = 5;
		int y = 6;
		if(x < y) {
			localVar = 10;
		}
		else {
			localVar = 20;
		}
		
		System.out.println("localVar = " + localVar);
		
		// --5
		// VarKindTest.instanceMethod1(); // 클래스 이름으로 호출불가
		varKindTest1.instanceMethod1();
		
		// --6.
		VarKindTest.staticMethod1();
		
	}

}
