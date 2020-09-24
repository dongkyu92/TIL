package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class SelectEmpLab {

	public static void main(String[] args) throws Exception {
		// 1. JDBC Driver 로딩 - Class.forName() (예외처리 필수)
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 클래스라는 이름의 클래스가 있는데 아규먼트는 오라클용 jdbc드라이버의 대장클래스를 지정한거임
		// 2. DBMS 에 접속 - (클래스) DriverManager.getConnection("jdbc url", "계정", "암호")
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");

		Statement stmt = conn.createStatement();

		boolean result = false;
		Random rd = new Random();
		result = rd.nextBoolean();

		if (result) {
			//String sql = "select ename, sal from emp";
			String sql = "select ename, TO_char(sal,'999,999') as sal from emp";
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				while (rs.next())
					System.out.println(rs.getString("ename") + " 직원의 월급은 " + rs.getString("sal") + "원입니다.");
			}
			rs.close();
			stmt.close();
			conn.close();
		}

		else {// false일때
			String sql = "select ename, To_char(hiredate, 'yyyy\"년\" mm\"월\" dd\"일\"') hiredate from emp";
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				while (rs.next())
					System.out.println(rs.getString("ename") + " 직원은 " + rs.getString("hiredate") + "에 입사하였습니다.");
			}
			rs.close();
			stmt.close();
			conn.close();
		}

	}

}
