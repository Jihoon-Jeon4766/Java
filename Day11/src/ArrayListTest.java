// 제네릭 타입을 왜 사용해야 하나?
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컬렉션에 요소를 자바에서 사용하는 모든 클래스 객체를 사용하고 싶다.
		// 특정 클래스에서 사용하는 속성을 특정 타입으로 제한하지 않고
		// 모든 클래스 타입을 사용하고 싶으면 해당 속성의 타입을 어떤 타입으로
		// 지정하면 될까?
		// 속성의 데이터 타입을 Object 로 지정하면 된다.
		
		// 그래서 구버전에서는 각 컬렉션의 요소의 기본타입은 Object 타입으로
		// 지정이 되어 있었다.
		
		// 요소의 타입을 Object 타입으로 지정했을때의 단점
		// 1. 요소를 저장할때와 사용할때 매번 캐스팅이 일어나므로
		// 성능이 저하된다.
		

		ArrayList list = new ArrayList(); // 요소의 타입은 Object로 지정됨
		list.add("aaa"); // 요소의 타입이 무조건 Object 타입으로 UpCasting 됨
		String str = (String)list.get(0); // 요소를 조회할때도 요소는 무조건
		// Object 타입으로 반환이 되므로 처음에 저장한 요소의 타입으로 DownCasting
		// 해서 사용해야 한다.
		System.out.println("str = " + str);
		
		// 2. 컴파일 타임에 정확한 타입 체크가 안됨
		list.add(1);
		String str1 = (String)list.get(1);
		System.out.println("str1 = " + str1);
		
		// 제네릭 타입
		// 클래스를 설계할때 사용하는 속성의 타입을 파라미터로 전달받을 수 있게
		// 정의하고
		// 개발할때 구체적인 타입으로 속성의 타입을 지정하고 사용하게 하는 방식
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		// list2.add("aaa");
		int intValue = list2.get(0);
		
	}

}
