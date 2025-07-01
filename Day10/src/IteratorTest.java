// Iterator 인터페이스
// 컬렉션의 요소들을 순차적으로 접근해서 처리하는 기능(메소드)를 제공하는 인터페이스
// 이 기능이 향상된 기능이 스트림이다.

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) { // 작업할 다음 요소가 있으면 true 반환
			System.out.println(it.next()); // 다음 요소를 반환하면 다음 위치로 이동	
		}
	}

}
