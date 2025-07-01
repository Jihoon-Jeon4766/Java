
public class InfinityAndNaNCheckExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		
		System.out.println(Double.isFinite(z));
		System.out.println(Double.isNaN(z));
		
		// 잘못된 연산
		System.out.println(z + 2);
		
		if(Double.isInfinite(z)||Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		else {
			System.out.println(z + 2);
		}
	}

}
