/* 배열 항목을 하나씩 가져와서 출력하는 코드입니다. 가져온 항목이 "three"가 되면 while문을 빠져나갈려고 합니다.
stop 플래그 변수를 이용해서 코드를 작성해 보세요. */
public class WorkShop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"one","two","three","four"};
		boolean stop = true;
		int index = 0;
		
		while (stop) {
			String item = array[index];
			if(item.equals("three")) {
				stop = false;
			}
			else {
				System.out.println(item);
			}
			index++;
		}
	}
	
}
