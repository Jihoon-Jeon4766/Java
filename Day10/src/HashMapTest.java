import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cityArray = {"인천","춘천","부산","용인","서울","천안","아산"};
		
		// 제네릭타입<key,value>
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// HashMap안에 넣는 메소드 put
		for (int i = 0; i < cityArray.length; i++) {
			hashMap.put(i, cityArray[i]);
		}
		
		// 맵에 저장되어 있는 요소들을 반복해서 출력
		// 맵에서 키값들만 Set 형태로 얻어온 후 키값을 반복하면서 각 키에 대한 값들을 출력
		Set<Integer> ketSet = hashMap.keySet();
		
		for(Integer key : ketSet) {
			System.out.println(hashMap.get(key));
		}
	}

}
