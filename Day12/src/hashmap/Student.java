package hashmap;

public class Student {
	private int sno;
	private String name;
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student member = (Student)obj;
			return member.name.equals(name) && member.sno == sno;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}
}
