package hashset;

public class Member {
	private String name;
	private int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && member.age == age;
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// String 클래스의 hashCode 값은 문자열이 같으면 같은 값을 반환하게 오버라이딩 되어 있음
		return name.hashCode() + age;
	}
}
