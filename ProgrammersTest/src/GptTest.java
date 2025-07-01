import java.util.Scanner;

public class GptTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int win = 0;
        int lose = 0;

        while (true) {
            System.out.println("가위 바위 보를 선택하세요");
            System.out.print("가위(1), 바위(2), 보(3): ");
            int num1 = scanner.nextInt();

            if (num1 < 1 || num1 > 3) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            int num2 = (int) (Math.random() * 3) + 1;

            if (num1 == num2) {
                System.out.println("비겼습니다.");
            } else if ((num1 == 1 && num2 == 3) || 
                       (num1 == 2 && num2 == 1) || 
                       (num1 == 3 && num2 == 2)) {
                System.out.println("이겼습니다!");
                win++;
            } else {
                System.out.println("졌습니다.");
                lose++;
            }

            System.out.println(win + " win, " + lose + " lose");

            System.out.print("한 게임 더 할래? (재시작: 1, 종료: 2): ");
            int num = scanner.nextInt();
            if (num == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}
