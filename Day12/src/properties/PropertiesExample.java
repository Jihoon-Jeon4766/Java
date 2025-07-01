package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// Properties : 주로 속성을 다룰때 사용함 

public class PropertiesExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		String path = 
			PropertiesExample.class.getResource("database.properties").getPath();
		
		System.out.println("path = " + path);
		
		// 입력스트림 : 다른 자원을 애플리케이션으로 읽어들이는 역할을 하는 API
		// 최상의 클래스가 InputStream
		// 입력스트림 중 문자단위로 데이터를 읽어들이는 스트림이 Reader 
		
		// 입출력 작업을 할때는 IOException을 처리해야 함
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}

}
