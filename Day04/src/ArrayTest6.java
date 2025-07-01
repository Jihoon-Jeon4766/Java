// 배열에 저장된 각 숫자의 개수 구하기
public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = new int[10]; // 랜덤하게 숫자 10개를 저장하는 배열 
		int[] counter = new int[10]; // number 배열에 저장된 각 숫자의 개수를 저장할 배열
		// counter 배열의 인덱스 값을 number 배열에 저장된 숫자 값으로 사용할거임

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int) (Math.random() * 10));
		}
		System.out.println();
		// 자바에서 배열객체를 생성하면
		// 배열의 각 영역에 데이터타입의 기본값으로 자동 초기화된다.
		// 정수형 : 0
		// 실수형 : 0.0
		// 문자형 : ' '
		// 논리형 : false
		// 객체타입 : null
		for (int i = 0; i < number.length; i++) {
			// number 배열의 0번 인덱스의 값이 5
			// counter[5]++ ===> 1
			// number 배열의 1번 인덱스의 값이 3
			// counter[3]++ ===> 1
			// number 배열의 2번 인덱스의 값이 5
			// counter[5]++ ===> 2
			counter[number[i]]++;
		}
		
		// 결과출력
		for (int i = 0; i < counter.length; i++) {
			System.out.println(i + "의 개수" + counter[i]);
			
			
		}
	}

}
