package transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 트렌젝션 처리
// 여러개의 데이터를 조작하는 작업을 하나의 작업단위로 묶어서 여러 작업 중 하나의 작업만 실패해도 전체작업을 롤백하는 작업
// 작업을 완성시킬때는 commit() 메소드
// 작업을 전체 취소시킬때는 rollback() 메소드 사용
// insert 작업을 세번 실행하면서 하나의작업만 실패해도 전체 INSERT 작업을 다 취소시키기
// 자바는 기본적으로 autoCommit 속성이 true이다.
// 데이터를 조작하는 작업(INSERT, UPDATE, DELETE)을 하면 자동 commit이 됨
// 만약, 여러 작업을 트랜젝션 처리하려면 Connection 객체의 autoCommit 속성을 false로 지정해야 함

public class TransActionTest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		Connection con = null;
		boolean allSuccess = false;
		// 모든 작업이 성공했는지 값을 저장할 변수
		try {
		con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.18.71:1521:XE", 
				"java1", 
				"java1");
		con.setAutoCommit(false);
		// 트랜젝션 중에 실행한 데이터를 조작하는 작업(INSERT, DELETE, UPDATE)들은
		// 우선 메모리 상에서만 작업이 이루어지고, 실제 데이터페이지에는 적용되지 않는다.
		// COMMIT을 해야 실제 데이터페이지에 적용된다.
		// ROLLBACK을 하면 수행한 모든 작업이 취소된다.
		
		String sql = "CREATE TABLE test5(id VARCHAR2(12), passwd VARCHAR2(12))";
		pstmt = con.prepareStatement(sql);
		pstmt.executeUpdate(); // test5 테이블 생성
		
		sql = "INSERT INTO test5 VALUES(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "java1");
		pstmt.setString(2, "java1");
		pstmt.executeUpdate();
		
		sql = "INSERT INTO test5 VALUES(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "java2");
		pstmt.setString(2, "java2");
		pstmt.executeUpdate();
		
		sql = "INSERT INTO test5 VALUE(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "java3");
		pstmt.setString(2, "java3");
		pstmt.executeUpdate();
		
		allSuccess = true;
		
		System.out.println("connection success!!");
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
		finally {
			try {
				if(allSuccess) {
					con.commit(); // 작업 완성
				}
				else {
					con.rollback(); // 전체 작업 취소
				}
				
				pstmt.close();
				con.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
