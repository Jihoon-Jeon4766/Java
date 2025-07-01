import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		while(true) {
			System.out.println("가위 바위 보를 선택하세요");
			System.out.print("가위 1번, 바위 2번, 보 3번 : ");
			int num1 = scanner.nextInt();
			int num2 = (int)(Math.random()*3)+1;
			if(num1 == 1) {
				if(num2 == 2) {
					System.out.println("졌습니다.");
					lose++;
				}
				else {
					System.out.println("이겼습니다.");
					win++;
				}
			}
			else if(num1 == 2) {
				if(num2 == 3) {
					System.out.println("졌습니다.");
					lose++;
				}
				else {
					System.out.println("이겼습니다.");
					win++;
				}
			}
			else {
				if(num2 == 1) {
					System.out.println("졌습니다.");
					lose++;
				}
				else {
					System.out.println("이겼습니다.");
					win++;
				}
			}
			System.out.println(win + " win," + lose + " lose");
			System.out.print("한게임 더 할래? 재시작 1, 종료 2 : ");
			int num = scanner.nextInt();
			if(num == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}

}
