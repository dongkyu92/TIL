package jdbcsrc;

import java.sql.*;
public class CreateTable {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		Statement stmt = conn.createStatement();
		//DB연결
		
		//테이블 생성 또는 삭제
		if (args.length == 1 && args[0].equals("create")) {
			stmt.executeUpdate("CREATE TABLE product "
					+ "(id char(5), classid char(2), name varchar(50),balance int, price float)");
			System.out.println("테이블이 생성되었습니다.");
			//ORA-00955: name is already used by an existing object
			
		} else {
			stmt.executeUpdate("DROP TABLE product");
			//executeUpdate는 인트형 0또는 1이 리턴됨.
			System.out.println("테이블이 삭제되었습니다.");
			// ORA-00942 : table or view does not exist.
		}
		stmt.close();
		conn.close();
	}
}
