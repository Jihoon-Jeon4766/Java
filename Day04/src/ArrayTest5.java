// 정렬
// 배열에 임의의 10개 숫자를 저장하고 작은 숫자부터 큰 숫자로 정렬

// 1. 배열에 임의의 10개의 숫자 저장
// 2. 숫자를 비교해서 앞의 숫자가 뒤의 숫자보다 크면 앞의 숫자를 뒤로, 뒤의 숫자를 앞으로 보내기(스왑)
public class ArrayTest5 {
	public static void main(String[] args) {
		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		// 정렬
		for (int i = 0; i < number.length; i++) {
			// 숫자 배열의 첫 번째 숫자 부터 마지막 숫자까지 비교하는 작업을 진행한 횟수

			boolean changed = false;
			// 더이상 비교를 안해도 될 때 빠져나오기 (변경 작업 있을 시 : true) /**/

			for(int j = 0; j < number.length -1 - i; j++) {
				if(number[j] > number[j+1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true;
				}
			}

			if(!changed) {
				break;
			}

			for (int j = 0; j < number.length; j++) {
				System.out.print(number[j]);
			}

			System.out.println();
		}
	}
}

