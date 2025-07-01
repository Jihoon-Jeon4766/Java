// StringTokenizer
// 문자열을 지정한 구분자로 분리해서 분리된 문자열 토큰들을 생성하는 클래스

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source1 = "한국 미국 태국 중국 이란";
		StringTokenizer st1 = new StringTokenizer(source1);
		// StringTokenizer 객체를 생성할때 인자로 하나만 지정하면
		// Whitespace(스페이스문자, 탭문자, 개행문자 등) 가 구분자가 된다.
		while(st1.hasMoreTokens()) { // 더 작업할 문자열 토큰이 있으면 true 반환
			System.out.println("token : " + st1.nextToken());
		}
		System.out.println();
		
		String source2 = "푸들,삽살개,풍상개,진돗개";
		StringTokenizer st2 = new StringTokenizer(source2, ",");
		while(st2.hasMoreTokens()) { // 더 작업할 문자열 토큰이 있으면 true 반환
			System.out.println("token : " + st2.nextToken());
		}
		
		StringTokenizer st3 = new StringTokenizer(source2, ",", true);
		while(st3.hasMoreTokens()) { // 더 작업할 문자열 토큰이 있으면 true 반환
			System.out.println("token : " + st3.nextToken());
		}
	}

}
