import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		
		while(true) {
			System.out.println("가위 바위 보를 선택하세요");
			int randomNum = (int)(Math.random() * 3) + 1;
			System.out.print("가위 1번, 바위 2번, 보 3번 : ");
			int num = scanner.nextInt();
			
			/*if (randomNum == num) {
			    System.out.println("비겼습니다.");
			} 
			else if ((randomNum == 1 && num == 3) || 
			           (randomNum == 2 && num == 1) || 
			           (randomNum == 3 && num == 2)) {
			    System.out.println("이겼습니다!");
			    win++;
			} 
			else if(num > 3) {
				System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
				continue;
			}
			else {
			    System.out.println("졌습니다.");
			    lose++;
			}*/
			
			if (num > 3) {
			    System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
			} else {
			    boolean winSuccess = (randomNum == 1 && num == 3) || 
			                    (randomNum == 2 && num == 1) || 
			                    (randomNum == 3 && num == 2);
			    System.out.println((randomNum == num) ? "비겼습니다." : (winSuccess ? "이겼습니다!" : "졌습니다."));
			    if (randomNum != num) {
			        if (winSuccess) win++;
			        else lose++;
			    }
			}
			
			System.out.println(win + " win," + lose + " lose");
			System.out.print("한게임 더 할래 ? 재시작 1, 종료 2 :" );
			int replay = scanner.nextInt();
			if(replay == 1) {
				continue;
			}
			else if(replay == 2) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
		scanner.close();
	}

}
