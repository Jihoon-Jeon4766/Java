import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner는 객체
		
		// 1.입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("연도 입력 : ");
        int year = scanner.nextInt();
        
        // 2.연산
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        // 3.결과 출력
        if (leapYear) {
            System.out.print(year + "년은 윤년입니다.");
        } else {
            System.out.print(year + "년은 윤년이 아닙니다.");
        }
    }

 
}