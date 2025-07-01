package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("최지환", 25));
		set.add(new Member("최지환", 25));
		
		System.out.println("요소의 갯수 : " + set.size());
	}

}
