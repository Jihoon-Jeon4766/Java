import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] carArray = {"그렌저","K9","포르쉐","Ray","지바겐","페라리"};
		
		LinkedList<String> queue = new LinkedList<String>();
		
		for(String car : carArray) {
			queue.offer(car);
		}
		System.out.println("queue의 크기 : " + queue.size());
		
		String data = "";
		while((data = queue.poll()) != null) {
			System.out.println(data);
		}
		System.out.println("queue의 크기 : " + queue.size());
	}

}
