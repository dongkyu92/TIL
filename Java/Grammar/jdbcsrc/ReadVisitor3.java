package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadVisitor3 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {// throw절이 무조건 좋은건 아님. 메인메서드는 JVM이 대신 예외처리해서 상관없음.
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			stmt = conn.createStatement();
			String sql = "select name, to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"') writedate, memo from visitor";
			// 백\슬레쉬를 넣어서 일반문자 더블인용부호야ㅣ..
			
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("writedate")+"\t");
				System.out.println(rs.getString("memo")); 
			//System.out.println(rs.getString("3"));  //셀렉트절에 나온 컬럼의 얼라이언스 이름을 지정해서 호출할 수 있고,
				//컬럼 순서로 호출하는 것도 가능스...
			}
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);
			//표준 오류출력은 System.err...
			//윈도우 운영체제는 SYstem.out 이나 err나 차이없음..
			//리눅스는 차이가 있음..
			//대부분 시스템쩜아웃 씀..
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
				//위에 초기화한 이유,,
				//초기화 안한상태에서 초기화하면 안됨.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
