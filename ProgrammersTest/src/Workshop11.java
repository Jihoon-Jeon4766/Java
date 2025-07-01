import java.util.HashMap;
import java.util.Scanner;

class UserInfoBean{
	private String userName;
	private String phone;
	private String email;
	public UserInfoBean(String userName, String phone, String email) {
		super();
		this.userName = userName;
		this.phone = phone;
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름" + userName + "전번" + phone + "이메일" + email;
	}

}
class LogInProcess{
	private HashMap<String, UserInfoBean> userInfos;
	private HashMap<String, String> userPasswords;
	public LogInProcess() {
		// TODO Auto-generated constructor stub
		userPasswords = new HashMap<String, String>();
		userInfos = new HashMap<String, UserInfoBean>();

		userPasswords.put("aaa", "1111");
		userPasswords.put("bbb", "2222");
		userPasswords.put("ccc", "3333");

		userInfos.put("123", new UserInfoBean("최지환", "01040690681", "xfortx08@bu.ac.kr"));
		userInfos.put("123", new UserInfoBean("최지환", "01040690681", "xfortx08@bu.ac.kr"));
		userInfos.put("123", new UserInfoBean("최지환", "01040690681", "xfortx08@bu.ac.kr"));

	}
	
	UserInfoBean logIn(String userName, String password) {
		UserInfoBean userInfoBean = null;
		if(password.contains(userName)) {
			if (password.equals(userPasswords.get(userName))) {
				userInfoBean = userInfos.get(userName);
				return userInfoBean;
			}
		}
		return userInfoBean;
	}
}
public class Workshop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		LogInProcess logInProcess = new LogInProcess();

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
