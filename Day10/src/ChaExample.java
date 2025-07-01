
import java.util.*;

class ChaExample {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> kyo = new ArrayList<Integer>(); // 교집합
		ArrayList<Integer> cha = new ArrayList<Integer>(); // 차집합
		ArrayList<Integer> hap = new ArrayList<Integer>(); // 합집합
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
	
		// 교집합
		kyo.addAll(list1);
        kyo.retainAll(list2); 
        // 특정 ArrayList 객체에 담긴 요소 중에
        // 인자로 지정된 ArrayList에 저장된 요소만 남기고 나머지 요소를 제거
        // retainAll()
             
        // 차집합
        cha.addAll(list1);
        // removeAll : 메소드를 호출한 컬렉션에서 인자로 지정된 컬렉션의 요소들을 
        // 모두 제거 하는 메소드
        cha.removeAll(list2); 

        // 합집합
        hap.addAll(list1);
        hap.removeAll(kyo);
        hap.addAll(list2);
      
      
       
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
		
		
	}
}