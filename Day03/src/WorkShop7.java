
public class WorkShop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					num++;
				}
			}
		}
		
		System.out.println(num);
	}

}
