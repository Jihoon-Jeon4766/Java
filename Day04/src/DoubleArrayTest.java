
public class DoubleArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.배열선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];

		// 2.배열 객체 생성
		arr1 = new int[3][3];

		// 3.값 할당
		// 1차원 배열에 값 자체를 할당할 수는 없다.
		// arr1[0] = 9; error
		arr1[0] = new int[3];

		// 값은 2차원 배열 영역에 할당해야 함
		arr1[0][0] = 90;

		// 가변 길이 배열
		// 2차원 배열은 객체를 생성할때 크기를 지정하지 않고 가변길이의 배열로 사용할 수 있다.
		int[][] arr4 = new int[3][];

		arr4[0] = new int[1];
		arr4[1] = new int[2];
		arr4[2] = new int[3];

		int count = 1;
		for (int i = 0; i < arr4.length; i++) { // 1차원 배열 반복
			for (int j = 0; j < arr4[i].length; j++) { // 각 1차원 배열의 인덱스 영역에서 참조하는 2차원 배열객체 반복
				arr4[i][j] = count++;
			}
		}
		for (int i = 0; i < arr4.length; i++) { // 1차원 배열 반복
			for (int j = 0; j < arr4[i].length; j++) { // 각 1차원 배열의 인덱스 영역에서 참조하는 2차원 배열객체 반복
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}

		// 5. 값을 초기화 시키면서 배열객체 만들기
		// 5-1
		int[][] arr5 = {{2,3,4},{1,2,3},{4,3,5}};
		System.out.println("int[][] arr5 = {{2,3,4},{1,2,3},{4,3,5}};");
		for (int i = 0; i < arr5.length; i++) { // 1차원 배열 반복
			for (int j = 0; j < arr5[i].length; j++) { // 각 1차원 배열의 인덱스 영역에서 참조하는 2차원 배열객체 반복
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}
		// 5-2
		int[][] arr6 = {{2,3,4},{1,2,3},{4,3,5}};
		System.out.println("int[][] arr6 = {{2,3,4},{1,2,3},{4,3,5}};");
		for (int i = 0; i < arr6.length; i++) { // 1차원 배열 반복
			for (int j = 0; j < arr6[i].length; j++) { // 각 1차원 배열의 인덱스 영역에서 참조하는 2차원 배열객체 반복
				System.out.print(arr6[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		int[][] arr7 = new int[4][4];

		for (int i = 0; i < arr7.length; i++) {
			arr7[i][i] = 1;
		}

		for (int i = 0; i < arr7.length; i++) {
			for (int j = 0; j < arr7.length; j++) {
				System.out.print(arr7[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		int[][] arr8 = new int[4][4];
		
		for (int i = 0; i < arr8.length; i++) {
			for (int j = 0; j < arr8.length; j++) {
				if((i == 1 || j == 2) && (i == 2 || j == 1)) {
					arr8[i][j] = 0;
				}
				else {
					arr8[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < arr8.length; i++) {
			for (int j = 0; j < arr8.length; j++) {
				System.out.print(arr8[i][j]);
			}
			System.out.println();
		}
	}
}
