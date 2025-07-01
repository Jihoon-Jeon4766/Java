package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime(); // 10억분의 1초 단위의 시간 반환
		// 성능을 측정할때 주로 사용
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime(); // 10억분의 1초 단위의 시간 반환
		// 성능을 측정할때 주로 사용
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + "ns");
	}

}
