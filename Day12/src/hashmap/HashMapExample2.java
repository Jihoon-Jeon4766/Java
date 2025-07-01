package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 키는 중복되면 안됨
		map.put(new Student(1, "오정원"), 95);
		map.put(new Student(1, "오정원"), 95);
		
		System.out.println("총 Entry 수 : " + map.size());
	}

}
