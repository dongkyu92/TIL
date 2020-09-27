package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadVisitor6 {

	public static void main(String[] args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		System.out.println(conn);

		Statement stmt = conn.createStatement();

		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� �ܾ �Է��ϼ��� : ");
		String searchWord = scan.nextLine();
		scan.close();
		String sql = "select name, writedate, memo from visitor " + "where name like '%" + searchWord + "%'";
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next()) {
			System.out.println(rs.getString("name") + ":" + rs.getDate("writedate") + ":" + rs.getString("memo"));
		} else {
			System.out.println("�̸��� " + searchWord+"�� ������ ���� �ۼ��� ���� �����ϴ�.");
		}
		
		System.out.println("---------------��----------------");

		rs.close();
		stmt.close();
		conn.close();

	}

}