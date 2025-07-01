import java.util.HashSet;
// import : 다른 패키지에 있는 클래스를 임포트

import static java.lang.System.out;
// 특정 클래스에 정의된 static 속성이나 static 메소드를 임포트
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nationArray = {"USA","GERMANY","CHINA","KOREA","JAPAN","USA"};
		
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<String> hs2 = new HashSet<String>();
		
		for(String nation : nationArray) {
			if(!hs1.add(nation)) {
				// add : 인자로 지정된 요소가 정상적으로 추가되면 true를 반환
				hs2.add(nation);
			}
		}
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);
		
		// hs1 컬렉션에서 hs2컬렉션에 있는 모든 요소들을 삭제
		hs1.removeAll(hs2);
		out.println("hs1 : " + hs1);
		out.println("hs2 : " + hs2);
	}
}
