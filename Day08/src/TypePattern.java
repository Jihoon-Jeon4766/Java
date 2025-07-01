
public class TypePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object strObject = "strObject";
		
		// 17 버전 미만
		if(strObject instanceof String) {
			String str1 = (String)strObject;
			System.out.println(str1);
		}
		
		// 17 버전 이상
		// Type Pattern
		if(strObject instanceof String str1) {
			System.out.println(str1);
		}
	}

}
