package jdbcsrc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class ConnectDB {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver"); //��Ű�� oracle������, jdbc��Ű��, oracleDriver Ŭ����
		Connection conn = DriverManager.getConnection(
				                  "jdbc:oracle:thin:@localhost:1521:XE",
				                  "jdbctest", "jdbctest");
		//CRUD�߿� �� �ϵ� ������ �ʼ� �׷��� Ŭ����.�����Ӱ� ����̹� �޴��� ȣ���� �ʼ�.
		
		System.out.println(conn.getClass().getName());
		DatabaseMetaData mdata = conn.getMetaData();
		//ResultSetMetaData�� ����
		//����Ÿ���̽���Ÿ����Ÿ�� ���丮�Լ�(getMAtaData)
		//��Ÿ����Ÿ�� ���� ��Ÿ����(�ΰ�����)�� ����.
		//
		System.out.println(mdata.getClass().getName());
		System.out.println("���ӵ� DB ���� : "+
		                        mdata.getDatabaseProductName());
		//
		conn.close();
	}
}
