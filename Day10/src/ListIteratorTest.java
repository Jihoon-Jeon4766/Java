// Iterator는 전방향 작업만 가능
// ListIterator는 전후방향 작업 가능

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()) { // 작업할 다음 요소가 있으면 true 반환
			System.out.println(it.next()); // 다음 요소를 반환하면 다음 위치로 이동	
		}
		System.out.println();
		
		while(it.hasPrevious()) { // 작업할 다음 요소가 있으면 true 반환
			System.out.println(it.previous()); // 다음 요소를 반환하면 다음 위치로 이동	
		}
	}

}
