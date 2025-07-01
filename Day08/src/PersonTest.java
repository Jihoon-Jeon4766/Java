// 특정 클래스에 대해서는 부모클래스에 정의되어 있지 않은 기능을 사용해야 한다면
// 다운캐스팅을 해야 함
class PersonInfo{
	public void printShowSleepingType(Person person) {
		person.showSleepingStyle();
		
		if(person instanceof Student) {
		Student student = (Student)person;
		student.study();
		}
	}
}
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonInfo personInfo = new PersonInfo();
		personInfo.printShowSleepingType(new President());
		personInfo.printShowSleepingType(new Student());
		personInfo.printShowSleepingType(new Employee());
	}

}
