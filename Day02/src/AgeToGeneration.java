import java.util.Scanner;

public class AgeToGeneration {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력 : ");
        int age = scanner.nextInt();
        
        // 연산
        
        int generation = age - (age % 10);

        if(age <= 0) {
        	System.out.println("당신은 아직은 사람이 아닙니다.");
        }
        else if(generation >= 70) {
        	System.out.println("어르신 입니다.");
        }
        else if(generation < 10) {
        	System.out.println("당신은 유아입니다.");
        }
        else {
        	System.out.println("당신은 " + generation + "대입니다.");
        }

    }
}
