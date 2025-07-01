package vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("오늘은 즐겁다.", "여름이 왔다.", "최지환"));
		list.add(new Board("오늘은 즐겁다2.", "여름이 왔다2.", "최지환2"));
		list.add(new Board("오늘은 즐겁다3.", "여름이 왔다3.", "최지환3"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getWriter() + " " + list.get(i).getContent() + " "
								+ list.get(i).getSubject());
		}
		list.remove(2);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getWriter() + " " + list.get(i).getContent() + " "
								+ list.get(i).getSubject());
		}
	}
}
