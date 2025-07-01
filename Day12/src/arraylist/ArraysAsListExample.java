package arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Read Only 
		List<String> list1 = Arrays.asList("최지환","홍길동","손흥민");
		
		// list1.add("aaa");
		for (String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
