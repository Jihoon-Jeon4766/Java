import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        boolean choice = true;
        
        while (choice) {
            System.out.println("\n1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액조회");
            System.out.println("4. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");
            
            int num = scanner.nextInt();
            
            switch (num) {
                case 1:
                    System.out.print("입금 금액: ");
                    int depositMoney = scanner.nextInt();
                    account.deposit(depositMoney);
                    break;
                case 2:
                    System.out.print("출금 금액: ");
                    int withdrawMoney = scanner.nextInt();
                    account.withdraw(withdrawMoney);
                    break;
                case 3:
                    System.out.println("현재 잔액은 " + account.getBalance() + "원 입니다.");
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    choice = false;
                    break;
                default :
                	System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                	break;
            }
        }
    }
}
