import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, kor, eng, math;
        String name;

        while (true) {
            System.out.print("학생 번호 입력: ");
            number = scanner.nextInt();
            if (number >= 1 && number <= 10) {
                break;
            }
            System.out.println("잘못 입력했습니다.");
        }

        System.out.print("이름: ");
        name = scanner.next();

        while (true) {
            System.out.print("국어: ");
            kor = scanner.nextInt();
            if (kor >= 0 && kor <= 100) {
                break;
            }
            System.out.println("잘못 입력했습니다.");
        }

        while (true) {
            System.out.print("영어: ");
            eng = scanner.nextInt();
            if (eng >= 0 && eng <= 100) {
                break;
            }
            System.out.println("잘못 입력했습니다.");
        }

        while (true) {
            System.out.print("수학: ");
            math = scanner.nextInt();
            if (math >= 0 && math <= 100) {
                break;
            }
            System.out.println("잘못 입력했습니다.");
        }

        int total = kor + eng + math;
        double average = total / 3.0;

        System.out.println("번호 : " + number + " 이름 : " + name);
        System.out.println("국어 : " + kor + " 영어 : " + eng + " 수학 : " + math);
        System.out.println("총점 : " + total + " 평균 : " + average);
        

    }
}
