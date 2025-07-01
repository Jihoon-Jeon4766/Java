import java.util.Scanner;

public class FiveTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("정수 입력: ");
      int num = scanner.nextInt();
      
      int count = 0; // 5의 배수 개수
      int sum = 0;   // 5의 합 개수
      
      for(int i = 1; i<=num; i++) {
         if(i % 5==0) {
            count++; // 5로 나누어 질때 count 세기
            sum += i; // sum 더하기..
         }   
      }
      System.out.println("1부터 입력 받은 정수" + num + "까지 5의 배수의 개수 : " +count);
      System.out.println("1부터 입력 받은 정수" + sum + "까지 5의 배수의 합 : " +sum);

   }

}
