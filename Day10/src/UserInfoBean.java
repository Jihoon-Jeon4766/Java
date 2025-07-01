
// 사용자의 정보를 저장할 클래스

public class UserInfoBean {
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
		return "이름 : " + userName + "\n전화번호 : " + phone + "\n이메일 : " + email;
	}
}
