// clone() : 자기자신 객체를 복제하는 메소드
// clone() 메소드를 사용하는 클래스는 Cloneable 인터페이스를 구현해야 함
// Cloneable에는 메소드가 하나도 정의되어 있지 않다.
// Cloneable 인터페이스는 clone 메소드를 사용할 수 있는 클래스인지 아닌지를 판단하는 기준으로만 사용되는
// 인터페이스이다. 이런 인터페이스를 마커(marker) 인터페이스라고 함.
class Member implements Cloneable{
	String name;
	int number;
	
	public Member(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	// clone 메소드를 사용하는 클레스에서는 무조건 clone() 메소드를 재정의해야 함
	// protected : 같은 패키지 내에서 접근 가능함
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member("최지환", 20);
		try {
			Member member2 = (Member)member1.clone();
			System.out.println("member1.name = " + member1.name + ", member1.number = " + member1.number);
			System.out.println("member2.name = " + member2.name + ", member2.number = " + member2.number);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


