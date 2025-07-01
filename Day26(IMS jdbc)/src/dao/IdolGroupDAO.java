package dao;

import static db.JdbcUtil.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.IdolGroupDTO;
import vo.IdolGroupVO;

public class IdolGroupDAO {
	private Connection con;

	// singleton
	// 특정 클래스에 정의된 메소드를 사용할때
	// 사용할때마다 객체를 생성하는 것이 아니고
	// 처음에 사용할때만 객체를 하나 생성한 후 공유해서 사용하는 방식

	private static IdolGroupDAO idolGroupDAO;

	private IdolGroupDAO() {
		// TODO Auto-generated constructor stub
	}

	public static IdolGroupDAO getInstance() {
		if(idolGroupDAO == null) {
			// 메소드가 처음 호출되었으면
			idolGroupDAO = new IdolGroupDAO();
		}
		return idolGroupDAO;
	}

	public void setConnection(Connection con) {
		// TODO Auto-generated method stub
		this.con = con;
	}

	// Primary Key가 idolGroupName인 테이블
	public String selectIdolGroupName(String idolGroupName) {
		// TODO Auto-generated method stub

		String dbIdolGroupName = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM IdolGroup WHERE idolGroupName = '" + idolGroupName + "'";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				dbIdolGroupName = rs.getString("idolGroupName");
			}
		} 
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(stmt);
		}
		return dbIdolGroupName;
	}

	public int insertIdolGroup(IdolGroupVO newIdolGroupVO) {
		// TODO Auto-generated method stub
		int insertCount = 0;

		Statement stmt = null;

		// 문자열 '""' 로 담는다. 문자열이 아닐때 ""
		String sql = "INSERT INTO idolGroup(idolGroupName, company, gender, genre, year, song, generation) VALUES ("
				+ "'" + newIdolGroupVO.getIdolGroupName() + "',"
				+ "'" + newIdolGroupVO.getCompany() + "',"
				+ "'" + newIdolGroupVO.getGender()  + "'," 
				+ "'" + newIdolGroupVO.getGenre() 
				+ "'," + newIdolGroupVO.getYear() + "," 
				+ "'" + newIdolGroupVO.getSong() + "',"
				+ newIdolGroupVO.getGeneration() + ")";

		try {
			stmt = con.createStatement();
			insertCount = stmt.executeUpdate(sql);

			if(insertCount > 0) {
				System.out.println("insert success!!");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(stmt);
		}
		return insertCount;
	}

	public ArrayList<IdolGroupVO> selectIdolGroupList() {
		// TODO Auto-generated method stub
		ArrayList<IdolGroupVO> idolGroupList = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM idolGroup";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if(rs.next()) {
				idolGroupList = new ArrayList<IdolGroupVO>();

				IdolGroupVO idolGroupVO = null;
				do {
					// 레코드 하나의 정보를 VO 객체에 저장
					// 레코드가 10개면 객체를 10개를 생성
					idolGroupVO = new IdolGroupVO(rs.getString("idolGroupName"), rs.getString("company"), 
							rs.getString("gender"), rs.getString("genre"), rs.getInt("year"), 
							rs.getString("song"), rs.getInt("generation"));
					idolGroupList.add(idolGroupVO);
				} while (rs.next());
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(stmt);
		}
		return idolGroupList;
	}

	public IdolGroupVO selectIdolGroup(String idolGroupName) {
		// TODO Auto-generated method stub

		IdolGroupVO idolGroupVO = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM IdolGroup WHERE idolGroupName = '" + idolGroupName + "'";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if(rs.next()) {
				idolGroupVO = new IdolGroupVO(rs.getString("idolGroupName"), rs.getString("company"), 
						rs.getString("gender"), rs.getString("genre"), rs.getInt("year"), 
						rs.getString("song"), rs.getInt("generation"));
			}
		} 
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(stmt);
		}
		return idolGroupVO;
	}

	public int updateIdolGroup(IdolGroupVO idolGroupVO) {
		int updateCount = 0;
		Statement stmt = null;

		String sql = "UPDATE IdolGroup " 
				+ "SET company = '" + idolGroupVO.getCompany() + "',"
				+ "gender = '" + idolGroupVO.getGender() + "',"
				+ "genre = '" + idolGroupVO.getGenre() + "',"
				+ "year =  " + idolGroupVO.getYear() + ","
				+ "song = '" + idolGroupVO.getSong() + "',"
				+ "generation = " + idolGroupVO.getGeneration() 
				+ " WHERE idolGroupName = '" + idolGroupVO.getIdolGroupName() + "'";

		try {
			stmt = con.createStatement();
			updateCount = stmt.executeUpdate(sql);

			if(updateCount > 0) {
				System.out.println("update success!!");
			}
		} 
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(stmt);
		}
		return updateCount;

	}

	public int deleteIdolGroup(String idolGroupNameForRemove) {
		// TODO Auto-generated method stub
		int deleteCount = 0;
		Statement stmt = null;

		String sql = "DELETE IdolGroup" 
				+ " WHERE idolGroupName = '" + idolGroupNameForRemove + "'";

		try {
			stmt = con.createStatement();
			deleteCount = stmt.executeUpdate(sql);

			if(deleteCount > 0) {
				System.out.println("delete success!!");
			}
		} 
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(stmt);
		}
		return deleteCount;

	}

	public ArrayList<IdolGroupVO> selectIdolGroupList(String generation) {
		// TODO Auto-generated method stub
		ArrayList<IdolGroupVO> idolGroupList = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "SELECT * FROM idolGroup WHERE generation = " + Integer.parseInt(generation);

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if(rs.next()) {
				idolGroupList = new ArrayList<IdolGroupVO>();

				IdolGroupVO idolGroupVO = null;
				do {
					idolGroupVO = new IdolGroupVO(rs.getString("idolGroupName"), rs.getString("company"), 
							rs.getString("gender"), rs.getString("genre"), rs.getInt("year"), 
							rs.getString("song"), rs.getInt("generation"));
					idolGroupList.add(idolGroupVO);
				} while (rs.next());
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			close(rs);
			close(stmt);
		}
		return idolGroupList;
	}
}
