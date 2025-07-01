import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginProcess logInProcess = new LoginProcess();

        System.out.print("아이디를 입력하세요: ");
        String userName = scanner.next();

        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.next();

        UserInfoBean userInfoBean = logInProcess.logIn(userName, password);
        if (userInfoBean != null) {
            System.out.println(userInfoBean);
        } 
        else {
            System.out.println("로그인 실패");
        }

    }
}
