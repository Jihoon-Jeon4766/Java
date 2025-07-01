import java.util.Arrays;

public class ArraysTestCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// copyOf
		int [] aArray = {1,2,3};
		int [] bArray = Arrays.copyOf(aArray, 2 * aArray.length);
		for (int i = 0; i < bArray.length; i++) {
			System.out.println("bArray [" + i + "] = " + bArray[i]);
		}
		
		// sorting
		int[] a = {2,4,3,7,1};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
