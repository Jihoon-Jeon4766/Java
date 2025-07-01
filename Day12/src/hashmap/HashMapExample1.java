package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 컬렉션 객체 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 요소 추가
		map.put("안병은", 95);
		map.put("홍길동", 90);
		map.put("김연아", 88);
		map.put("안병은", 80); // 실패, 기존 요소를 대체한다.
		System.out.println("총 Entry 수 : " + map.size()); // 3
		
		// 객체조회
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 저장된 객체들을 하나씩 출력
		// 맵에 저장된 키값들만 Set 타입으로 얻어와서
		// 각 키의 앖을 하나씩 조회
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			
			System.out.println(key + " = " + value);
		}
		System.out.println();
		
		// 요소 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		// EntrySet을 이용해서 맵에 저장된 요소 하나씩 출력
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry <String, Integer>> entryIterator = 
				entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + " = " + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
