package java_20200603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// Member 테이블을 접근하기 위한 클래스
// DAO : data Access object

public class MemberDao {
	
	public MemberDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insert(MemberDto m) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member1(num, NAME, addr) ");
			sql.append("VALUES(?, ?, ?) ");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setInt(++index, m.getNum());
			pstmt.setString(++index, m.getName());
			pstmt.setString(++index, m.getAddr());
			
			resultCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return resultCount;
	}
	
	public int update(MemberDto m) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member1 ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");
			pstmt = con.prepareStatement(sql.toString());
			
			int index = 0;
			pstmt.setString(++index, m.getName());
			pstmt.setString(++index, m.getAddr());
			pstmt.setInt(++index, m.getNum());
			
			resultCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return resultCount;
	}
	
	public int delete(int num) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member1 ");
			sql.append("WHERE num = ?");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, num);
			resultCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return resultCount;
	}
	
	public ArrayList<MemberDto> select() {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member1 ");
			sql.append("ORDER BY num ASC ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int index = 0;
				int num = rs.getInt(++index);
				String name = rs.getString(++index);
				String addr = rs.getString(++index);
				list.add(new MemberDto(num, name, addr));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
	}

	public MemberDto select(int num) {
		MemberDto mdto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member1 ");
			sql.append("WHERE num = ? ");
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int index = 0;
				int _num = rs.getInt(++index);
				String _name = rs.getString(++index);
				String _addr = rs.getString(++index);
				mdto = new MemberDto(_num, _name, _addr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return mdto;
	}
}










