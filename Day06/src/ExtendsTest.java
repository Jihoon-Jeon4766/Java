class Parent{
	int parentVar;
	
	void parentMethod() {
		System.out.println("parent method");
	}
}

class Child extends Parent{
	int childVar;
	
	void childMethod() {
		System.out.println("child method");
	}
}

class ChildChild extends Child{
	int childChildVar;
	
	void childChildMethod() {
		System.out.println("childChild method");
	}
}

public class ExtendsTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		
		System.out.println("child.parantVar = " + child.parentVar);
		System.out.println("child.childVar = " + child.childVar);
		
		ChildChild childChild = new ChildChild();
		childChild.parentMethod();
		childChild.childMethod();
		childChild.childChildMethod();
		
		// 각 속성도 상속받은 속성을 다 사용할 수 있다.
	}

}
