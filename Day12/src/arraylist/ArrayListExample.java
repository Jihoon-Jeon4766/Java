package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Server Programming");
		list.add("HTML/JavaScript/React/CSS");
		list.add("Spring Boot");
		list.add("Python Programming");
		list.add("Data analysis visualation");
		list.add("Machine Learning/Deep Learning");
		list.add("NLP");
		list.add("AI");
		list.add("AWS");
		list.add("Project");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		// 2번 인덱스에 있는 요소 조회
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " = " + list.get(i));
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("AWS");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " = " + list.get(i));
		}
		
		System.out.println();
	}

}
