package jdbcsrc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class ConnectDB {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver"); //패키지 oracle프로젝, jdbc패키지, oracleDriver 클래스
		Connection conn = DriverManager.getConnection(
				                  "jdbc:oracle:thin:@localhost:1521:XE",
				                  "jdbctest", "jdbctest");
		//CRUD중에 뭘 하든 접속은 필수 그래서 클래스.포네임과 드라이버 메니저 호출은 필수.
		
		System.out.println(conn.getClass().getName());
		DatabaseMetaData mdata = conn.getMetaData();
		//ResultSetMetaData도 있음
		//데이타베이스메타데이타의 팩토리함수(getMAtaData)
		//메타데이타의 용어는 기타정보(부가정보)를 뜻함.
		//
		System.out.println(mdata.getClass().getName());
		System.out.println("접속된 DB 서버 : "+
		                        mdata.getDatabaseProductName());
		//
		conn.close();
	}
}
