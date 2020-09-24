package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadVisitor2 {

	public static void main(String[] args) throws Exception {
//1. JDBC Driver �ε� - Class.forName() (����ó�� �ʼ�)
		Class.forName("oracle.jdbc.driver.OracleDriver"); // Ŭ������� �̸��� Ŭ������ �ִµ� �ƱԸ�Ʈ�� ����Ŭ�� jdbc����̹��� ����Ŭ������ �����Ѱ���
//2. DBMS �� ���� - (Ŭ����) DriverManager.getConnection("jdbc url", "����", "��ȣ")
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest"); // @���ָ� �����ּ� �ν� ����.,
		//�� ���� �Ǿ����� ���ؼ� ��ü ����..
		System.out.println(conn); // ToString
		//������� �����ϸ� oracle.jdbc.driver.T4CConnection@31a5c39e ��...
		//���� ���ϵ� ��ü�� ����� �Ҹ�..
		
//3. Statement/PreparedStatement ��ü ����
		Statement stmt = conn.createStatement();
//4. ó���Ϸ��� ��ɿ� ���� SQL ���� �����ϰ� �����Ų��.
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String searchName = scan.nextLine();
		scan.close();
		String sql = "select name, writedate, memo from visitor " + "where name = '"+searchName+"'"; //�����ݷ� ����
		ResultSet rs = stmt.executeQuery(sql);
		//����Ʈ�� �˻������ ���� ��, ����ִ� ����Ʈ ���� ����..
//5. ��� ó��
//   - ResultSet ��ü
//   - next() : ������� �Űܴٴϴ� �޼���, getXXX(): ����� �÷��� �б�. (ex) date���̸� getDate())
		
		if(rs.next()) {
			System.out.println(rs.getString("name")+":"+
					rs.getDate("writedate")+":"+rs.getString("memo"));
		}else {
			System.out.println("---------------end---------------");
		}
	/*	while(rs.next()){
			System.out.println(rs.getString("name")+":"+
		rs.getDate("writedate")+":"+rs.getString("memo"));
		}
		System.out.println("---------------end---------------");
		*/
		
		
        rs.close();
        stmt.close();
        conn.close();
//   - Select ����� ���� ��� ���ο� ������� ResultSet ��ü�� ����.
//   - next()���� ó�� ����� ���ϰ��� ������ ���� ���� ���ߴ� ---> �α��ν� Ȱ��.

//6. ����� close() �ʼ�..! �����α׷��� Ư���� ������ϸ� ��뵵 ���ϸ鼭 ��� �ٵ�����.
	}

}
