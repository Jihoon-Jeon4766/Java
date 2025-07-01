import java.util.Scanner;

public class DaysOfMonthTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("연도 입력:");
      int year = scanner.nextInt();
      System.out.print("달을 입력:");
      int month = scanner.nextInt();
      
      boolean leapYear = (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0);
      
      boolean rightMonth = true;
      
      int days = 0;
      
      switch (month) {
      case 1, 3, 5, 7, 8, 10, 12: 
         days = 31;
         break;
      case 4, 6, 9, 11 :
         days = 30;
         break;
      case 2:
         if(leapYear) {
            days = 29;         
         }
         else {
            days = 28;
         }
         break;   
      default :
         rightMonth = false;
         break;
      }
      if(rightMonth == true) {
         System.out.println(year + "년" + " " + month + "월은 총" + " " + days + "일 까지 존재합니다.");

      }
      else {
         System.out.println("달 값이 올바르지 않습니다.");
      }

   }

}
