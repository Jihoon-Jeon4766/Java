package hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// HashTable에 저장된 요소들을 이용해서 로그인 처리
public class HashTableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "1234");
		map.put("winter", "1234");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id = scanner.next();
			System.out.print("비밀번호 : ");
			String password = scanner.next();
			
			// containsKey(K k)
			// 인자로 지정한 키가 해당 맵에 존재하는 지를 판단
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}
			else {
				System.out.println("입력하신 아이디가 존재하지않습니다.");
			}
		}
	}

}
