import java.util.HashMap;

public class LoginProcess {
	
	private HashMap<String, UserInfoBean> userInfos;
	private HashMap<String, String> userPasswords;

	public LoginProcess() {
		// TODO Auto-generated constructor stub
		userInfos = new HashMap<String, UserInfoBean>();
		userPasswords = new HashMap<String, String>();
		
		// 1. 로그인에 사용될 아이디와 비밀번호 3개를 저장
		userPasswords.put("aaa", "1111");
		userPasswords.put("bbb", "2222");
		userPasswords.put("ccc", "3333");
		
		// 2. 각 사용자별 사용자정보를 맵에 저장
		userInfos.put("aaa", new UserInfoBean("최지환", "01040690681", "xfortx08@bu.ac.kr"));
		userInfos.put("bbb", new UserInfoBean("최지환", "01040690681", "xfortx08@naver.com"));
		userInfos.put("ccc", new UserInfoBean("최지환", "01040690681", "xfortx08@google.com"));
		
	}
	// 로그인에 성공하면 해당 사용자의 정보를 UserInfoBean 객체에 담아서 리턴
	// 로그인에 실패하면 null 리턴
	
	// UserInfoBean 타입의 변수를 선언해서 기본값을 null로 지정하고
	// 로그인에 성공하면 변수값을 성공한 사용자의 정보를 담은 UserInfoBean 객체를 만들어서 할당한 후
	// 해당 변수를 리턴
	public UserInfoBean logIn(String userName, String userPassword) {
		UserInfoBean userInfoBean = null;
		if (userPasswords.containsKey(userName)) {
			// 비밀번호를 비교
			if (userPassword.equals(userPasswords.get(userName))) {
				userInfoBean = userInfos.get(userName);
				return userInfoBean;
			}
		}
		return userInfoBean;
	}

}
