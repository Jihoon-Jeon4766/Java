import java.util.Iterator;

public class DoubleForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1-1. 이중 for문 버전
		/*for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		// 1-2. 이중 while문 버전
		/*int i = 1;
		while(i <= 5) {
			int j = 1;
			while(j <= 5 - i) {
				System.out.print(" ");
				j++;
			}
			
			j = 1;
			while(j <= 2 * i - 1) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
			
		}
		i = 4;
		while(i >= 1) {
			int j = 1;
			while(j <= 5 - i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while(j <= 2 * i - 1) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i--;
		}
		*/
		// 2.
		/*for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 10; j++) {
				if(i == 1 || i == 5 || j == 1 || j == 9) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		int n = 5;

		// 위쪽 삼각형
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 1; j <= 2 * i - 1; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}

		// 아래쪽 삼각형
		for (int i = n - 1; i >= 1; i--) {
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 1; j <= 2 * i - 1; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}

	}
}
