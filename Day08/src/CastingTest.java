
public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 부모클래스 타입의 레퍼런스 변수에 자식클래스 타입의 레퍼런스 값을 할당하면
		// 자식클래스 타입의 레퍼런스 값이 자동으로 부모클래스 타입으로 변환된(Upcasting) 후 할당됨
		Person person = new President();
		// 2. 자식클래스 타입의 레퍼런스 변수에 부모클래스 타입의 레퍼런스 값을 할당하면
		// 컴파일 오류 발생함
		// error
		// President president = person1;
		// 이런 경우에는 명시적으로 자식클래스타입으로 캐스팅하여(DownCasting) 할당해야 함
		 President president = (President)person;
			
		 // 다운캐스팅을 해야하는 경우
		 // 부모 클래스에 정의되어 있지 않은 자원에 접근할때 사용해야함
		 Person person2 = new Student();
		 person2.showSleepingStyle();
		 // error
		 // person2.study();
		 
		 if(person2 instanceof Student) {
		 Student student = (Student)person2;
		 student.study();
		 }
		 else {
			 System.out.println("캐스팅 불가");
		 }
		 // 자바에서 부모클래스 타입의 레퍼런스 변수가 자식 클래스 객체를 참조하는 것은 허용하지만
		 // 자식 클래스 타입의 레퍼런스 변수가 부모클래스 객체를 참조하는 것은 허용하지 않는다.
		 
		 // 다운캐스팅할때는 다운캐스팅이 가능한지 판단 후에 다운캐스팅해야 함
		 // instanceof
		 // 좌측에 있는 레퍼런스 변수를 우측에 있는 클래스 타입으로 캐스팅이 가능하면 true를 반환
		 Person person3 = new Person();
		 
		 if(person3 instanceof Student) {
		 Student student2 = (Student)person3;
		 student2.study();
		 }
		 else {
			 System.out.println("캐스팅 불가");
		 }
		 
		 // 3. 자바에서 캐스팅은 부모 자식 관계에서만 가능함
		 // student = (President)president;
		 
		 // 메소드의 파라미터 값을 전달받을때 각 자식클래스 타입을 인자로 전달 받으면
		 // 각 자식클래스 타입마다 메소드를 다 정의해야 함
		 
		 // 변수와 메소드 참조
		 // 부모클래스 타입의 레퍼런스 변수로 자식클래스 객체를 참조하는 경우
		 // 메소드를 호출하면 항상 자식 클래스에 재정의한 메소드가 호출된다.
		 // 즉, 자바에서 호출되는 메소드는 컴파일 타임이 아니고, 런타임시에 결정된다.
		 // 따라서, 자바에서 메소드의 다형성은 제공된다.
		 Person person4 = new Student();
		 person4.showSleepingStyle();
		 person4 = new President();
		 person4.showSleepingStyle();
		 person4 = new Employee();
		 person4.showSleepingStyle();
		
		 
		 // 변수를 호출하면 호출되는 변수는 컴파일 타임에 결정됨
		 // 즉, 변수는 레퍼런스 변수의 타입에 의해서 결정됨
		 // 즉, 자바에서 변수는 다형성을 제공하지 않습니다.
		 
		 Person person5 = new Employee();
		 System.out.println("person5.x = " +  person5.x);
		 
		 Employee employee = (Employee)person5;
		 System.out.println("employee2.x = " + employee.x);
	}

}
