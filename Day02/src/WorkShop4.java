import java.util.Scanner;

public class WorkShop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        
        System.out.println("****도형선택****");
        System.out.println("1. 삼각형");
        System.out.println("2. 원");
        System.out.println("3. 사다리");
        System.out.println("4. 종료");
        
        System.out.print("메뉴선택 : ");
        int shape = scanner.nextInt();
        
        double area = 0.0;
        
        if(shape == 1) {
        	System.out.println("****삼각형 넓이****");
        	System.out.print("아랫변 입력 : ");
        	double base = scanner.nextDouble();
        	System.out.print("높이 입력 : ");
        	double height = scanner.nextDouble();
        	area = (base * height) / 2;
        	System.out.printf("넓이 : %.2f\n", area);
        }
        else if(shape == 2) {
        	System.out.println("****원의 넓이****");
        	System.out.print("반지름 입력 : ");
        	double round = scanner.nextDouble();
        	area = pi * (round * round);
        	System.out.printf("넓이 : %.2f\n", area);
        }
        else if(shape == 3) {
        	System.out.println("****사다리의 넓이****");
        	System.out.print("아랫변 입력 : ");
        	double bottom = scanner.nextDouble();
        	System.out.print("윗변 입력 : ");
        	double top = scanner.nextDouble();
        	System.out.print("높이 입력 : ");
        	double height = scanner.nextDouble();
        	area = ((bottom + top) * height) / 2;
        	System.out.printf("넓이 : %.2f\n", area);
        }
        else if(shape == 4) {
        	System.out.println("종료했습니다.");
        }
	}
}
