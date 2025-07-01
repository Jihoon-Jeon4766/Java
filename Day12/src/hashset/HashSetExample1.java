package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set
// 중복된 요소를 허용하지 않고
// 순서가 유지되지 않는다. 수학의 집합과 같은 특성

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Server Programming");
		set.add("Oracle");
		set.add("Java"); // 실패
		
		int size = set.size();
		System.out.println("총 요소수 : " + size);
		
		// set에 저장된 요소들을 순차적으로 조회
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) { // 작업할 다음 요소가 있으면 true 반환
			String element = (String) iterator.next(); // 다음 요소를 반환하고 작업 위치를 다음요소로 이동
			System.out.println(element);
		}
		
		// 요소 삭제
		set.remove("Oracle");
		size = set.size();
		System.out.println("총 요소수 : " + size); // 2
		
		// set 컬렉션에 있는 요소들을 반복하면서 조회
		for(String element : set) {
			System.out.println(element);
		}
		
		// set 컬렉션에 있는 모든 요소 삭제
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("set 비어 있음");
		}
	}

}
