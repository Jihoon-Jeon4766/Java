
public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] hex = {'A','B','0','F'};
		char[] hex16 = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String[] binary = {"0000","0001","0010","0011","0100","0101",
				"0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
		
		System.out.println("hex : " + new String(hex));
//		String result = "";
//		for (int i = 0; i < hex.length; i++) {
//			
//			if(hex[i] <= '9') {
//			result += binary[hex[i] - '0'];
//			}
//			else {
//				result += binary[hex[i] - 'A' + 10];	
//			}
//		}
		
		System.out.print("binary = ");
		
		for(int i = 0;i < hex.length;i++) {
			for(int j = 0;j < hex16.length;j++) {
				if(hex[i] == hex16[j]) {
					System.out.print(binary[j]);
				}
			}
		}
		
//		System.out.println("binary = " + result);
		
	}

}
