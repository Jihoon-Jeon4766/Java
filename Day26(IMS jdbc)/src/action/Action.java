package action;

import java.util.Scanner;

// 각 요청을 처리하는 클래스들의 규격을정의하는 인터페이스
public interface Action {

	void execute(Scanner scanner);// 각 요청을 처리하는 클래들은 execute 메서드를 구현해서 요청을 처리함
	
}
