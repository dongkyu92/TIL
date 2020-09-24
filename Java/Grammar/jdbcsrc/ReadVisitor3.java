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
		try {// throw���� ������ ������ �ƴ�. ���θ޼���� JVM�� ��� ����ó���ؼ� �������.
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			stmt = conn.createStatement();
			String sql = "select name, to_char(writedate, 'yyyy\"��\" mm\"��\" dd\"��\"') writedate, memo from visitor";
			// ��\�������� �־ �Ϲݹ��� �����ο��ȣ�ߤ�..
			
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("writedate")+"\t");
				System.out.println(rs.getString("memo")); 
			//System.out.println(rs.getString("3"));  //����Ʈ���� ���� �÷��� ����̾� �̸��� �����ؼ� ȣ���� �� �ְ�,
				//�÷� ������ ȣ���ϴ� �͵� ���ɽ�...
			}
		} catch (Exception e) {
			System.err.println("���� �߻� : " + e);
			//ǥ�� ��������� System.err...
			//������ �ü���� SYstem.out �̳� err�� ���̾���..
			//�������� ���̰� ����..
			//��κ� �ý������ƿ� ��..
		} finally {
			try {
				if(rs != null)
					rs.close();
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
				//���� �ʱ�ȭ�� ����,,
				//�ʱ�ȭ ���ѻ��¿��� �ʱ�ȭ�ϸ� �ȵ�.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
