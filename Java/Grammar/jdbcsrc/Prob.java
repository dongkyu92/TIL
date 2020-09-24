package jdbcsrc;

import java.sql.*;
import java.util.Scanner;

public class Prob {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		kaja("E");
	}

	
	public static void kaja(String fn) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		Statement stmt = conn.createStatement();

		String sql = "select first_name, last_name, TO_char(salary,'999,999') as salary from employees where first_name like '%" + fn + "%'"; // 세미콜론 ㄴㄴ
		ResultSet rs = stmt.executeQuery(sql);

		
		if(rs.next()) {
			do {
				System.out.println(rs.getString("first_name") + "(" + rs.getString("last_name") + ")" + rs.getString("salary"));

			}while(rs.next());
		}
		else
			System.out.println( "DB연동 오류 발생 : XXX");
		
		rs.close();
		stmt.close();
		conn.close();
	
}}