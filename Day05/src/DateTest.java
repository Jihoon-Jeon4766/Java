/*
	문제1.날짜를 나타내는 클레스 Date를 만들어보자 Date는 연도,월,일 등의 속성을 가지며,				
	날짜를 2018.4.12과 같이 출력하는 메소드 print1()작성하고 날짜를 2018년4월12일과				
	같이 출력하는 print2()등의 메소드를 가진다. Date클레스를 작성하고 객체를 생성하여				
	테스트한다. 테스트 클레스는 DateTest라는 클레스를 만들어서 사용하시오.				
 */

class Date {
	int year;
	int month;
	int day;

	void print1() {
		System.out.println(year + "." + month + "." + day);
	}

	void print2() {
		System.out.println(year + "년" + month + "월" + day + "일");
	}
}
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		date.year = 2018;
		date.month = 4;
		date.day = 12;

		date.print1();
		date.print2();
	}

}
