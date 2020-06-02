package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args) {
		
		
		// 1. 드라이브 로드한다.
		// 메모리에 Driver 객체를 로드여 Java Application과 mariadb-java-client-xxx.jar과 연결한다.
		try {
			Class.forName("org.mariadb.jdbc.Driver");	
			System.out.println("드라이브 로드 성공.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로드 실패.");			
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			
			// 2. 데이터 베이스와 연결.
			// localhost : 데이터 베이스 설치 ip
			// 3306 : 데이터 베이스 포트 (mariadb 의 디폴트값)
			// kpc : 데이터 베이스 명
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",		// url
					"kpc12", 		// user
					"kpc1234");		// password
			System.out.println("데이터 베이스(MariaDB) 연결 성공.");
			
			
			// 3. SQL문을 전송할 수 있는 PreparedStatement 객체를 새성
			StringBuffer sql = new StringBuffer();
			// 주의) SQL문을 먼저 테스트 한 후 정상 작동 되면 붙여넣기
			// ?가 있는 곳에 값 넣을 수 있음 : 바인딩 변수 => 반드시 칼럼 값에만 사용해야 한다.
			sql.append("INSERT INTO member1(num, NAME, addr) VALUES(?, ?, ?)");	
			pstmt = con.prepareStatement(sql.toString());
			
			
			// 4. 바인딩 변수 설정
			pstmt.setInt(1, 9);
			pstmt.setString(2, "샤넬");
			pstmt.setString(3, "프랑스");
			
			
			// 5. SQL문 전송
			int resultCount = pstmt.executeUpdate();
			System.out.println("갱신된 행의 수 : " + resultCount);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				// 6. 모든 자원을 반납한다.
				try {
					if(con != null) con.close();
					if(pstmt != null) pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
