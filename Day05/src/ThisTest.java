// this
// 자기 자신객체를 가리키는 레퍼런스 변수
// 일반적으로는 사용할 일이 없다.
// 단, 파라미터 변수의 이름과 멤버변수의 이름이 같으면 메소드나 생성자 내에서는
// 파라미터 변수가 우선 인식됨으로, 사용되는 변수가 멤버변수임을 인식시키려면
// this 예약어를 지정해야 함
class Data2{
	int x;
	
	public Data2(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
	}
	
	public void printInfo() {
		int y = this.x;
		this.printInfo2();
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void printInfo2() {
		
	}
}

public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 data = new Data2(100);
		System.out.println("data.x = " + data.x); // this.x = x; 일시 100
		data.setX(200);
		System.out.println("data.x = " + data.x); // setX메소드에 this.x = x; 일시 200
	}

}
