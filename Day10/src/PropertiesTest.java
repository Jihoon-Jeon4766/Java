// Properties
// Hashtable을 상속한 클래스
// Hashtable은 키와 값으로 어떠한 객체도 사용할 수 있지만
// Properties는 키와 값으로 문자열(String)만 가능
// 따라서, 주로 속성값을 다룰때 사용한다.

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.setProperty("id", "java");
		prop.setProperty("password", "1111");
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		
		String id = prop.getProperty("id");
		String password = prop.getProperty("password");
		String driver = prop.getProperty("driver");
		
		System.out.println("id = " + id);
		System.out.println("password = " + password);
		System.out.println("driver = " + driver);
		
		System.out.println("속성 이름들을 얻어와서 각 속성이름들에 대한 속성을 출력");
		Enumeration<String> propertyNames = (Enumeration<String>)prop.propertyNames();
		
		while(propertyNames.hasMoreElements()) { // 다음 요소가 있는지 판단
			String propertyName = propertyNames.nextElement(); // 요소 하나 반환
			System.out.println(propertyName + " = " + prop.getProperty(propertyName));
		}
	}

}
