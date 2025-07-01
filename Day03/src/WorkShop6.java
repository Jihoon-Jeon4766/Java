import java.util.Iterator;

public class WorkShop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, ans = 0; 

		while (ans <= 100) { 
			if (i % 2 == 1) { 
				ans += i;
			} 
			else { 
				ans -= i;
			}
			i++; 
		}

		System.out.println(i); 
	}
}
