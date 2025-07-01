/* 1. 성적처리프로그램

(1) (중간 + 기말) / 2 ----> 60%
	레포트           -----> 20%
	출석             ----> 20%
	(계산방법) 성적 = (중간 + 기말)/2 * 0.6 + 레포트 * 0.2 + 출석 * 0.2

(2) 90이상 'A'학점
	80이상 'B'학점
	70이상 'C'학점
	60이상 'D'학점
	나머지 'F'학점
	(if~else if문 이용)

(3) A,B 학점 = "excellent"
	C,D 학점 = "good"
	F학점 = "poor"
	(switch문 이용) */

import java.util.Scanner;

public class WorkShop1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("중간 : ");
		int a = scanner.nextInt();
		System.out.print("기말 : ");
		int aa = scanner.nextInt();
		System.out.print("레포트 : ");
		int aaa = scanner.nextInt();
		System.out.print("출석 : ");
		int aaaa = scanner.nextInt();

		double i = (double)(a + aa)/2 * 0.6 + (aaa * 0.2) + (aaaa * 0.2);

		String grade = "";

		if(i >= 90) {
			grade = "A";
		}
		else if(i >= 80) {
			grade = "B";
		}
		else if(i >= 70) {
			grade = "C";
		}
		else if(i >= 60) {
			grade = "D";
		}
		else if(i < 60) {
			grade = "F";
		}
		else {
			grade = null;
		}

		String message = "";

		switch (grade) {
		case "A", "B":
			message = "excellent";
		break;
		case "C", "D":
			message = "good";
		break;
		case "F":
			message = "poor";
			break;

		default:
			message = "unknown";
			break;
		}

		
			System.out.printf("성적 = %.2f\n", i);
			System.out.println("학점 = " + grade);
			System.out.println("평가 = " + message);
			
	}
}
