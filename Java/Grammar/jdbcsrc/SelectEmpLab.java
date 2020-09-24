package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class SelectEmpLab {

	public static void main(String[] args) throws Exception {
		// 1. JDBC Driver �ε� - Class.forName() (����ó�� �ʼ�)
		Class.forName("oracle.jdbc.driver.OracleDriver"); // Ŭ������� �̸��� Ŭ������ �ִµ� �ƱԸ�Ʈ�� ����Ŭ�� jdbc����̹��� ����Ŭ������ �����Ѱ���
		// 2. DBMS �� ���� - (Ŭ����) DriverManager.getConnection("jdbc url", "����", "��ȣ")
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
					System.out.println(rs.getString("ename") + " ������ ������ " + rs.getString("sal") + "���Դϴ�.");
			}
			rs.close();
			stmt.close();
			conn.close();
		}

		else {// false�϶�
			String sql = "select ename, To_char(hiredate, 'yyyy\"��\" mm\"��\" dd\"��\"') hiredate from emp";
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				while (rs.next())
					System.out.println(rs.getString("ename") + " ������ " + rs.getString("hiredate") + "�� �Ի��Ͽ����ϴ�.");
			}
			rs.close();
			stmt.close();
			conn.close();
		}

	}

}
