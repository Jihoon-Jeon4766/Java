class Super{
	String name = "최지환";
}

class Sub extends Super{
	String name = "박서준";
	
	String getLocalName() {
		String name = "변우석";
		
		return name;
	}
	
	// 메소드 안에서 자기 자신 클래스에 정의된 멤버변수에 접근하려면 this를 사용하면 됨
	String getThisName() {
		String name = "서강준";
		return this.name;
	}
	
	// 메소드 안에서 부모 클래스에 정의된 멤버변수에 접근하려면 super를 사용하면 된다.
	String getSuperName() {
		String name = "차은우";
		return super.name;
	}
}

public class ThisSuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println("localName = " + sub.getLocalName());
		System.out.println("thisName = " + sub.getThisName());
		System.out.println("supername = " + sub.getSuperName());
	}

}
