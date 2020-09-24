package jdbcsrc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ReadVisitor4 {
	public static void main(String[] args) { //파이널리 블럭이 없어졌음..
		try {
			Class.forName("oracle.jdbc.OracleDriver"); 
			//클로즈 필요없기때문에 따로 트라이 했음.
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "select name, to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"') writedate, memo from visitor"; 
		try (	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);) {		// 파이널리(클로즈) 안쓰려고 트라이 캐치 위드리소스..
			// 클로즈할때마다 예외처리하는게 너무 번거로워서 자바5에서부터 트라이 캐치 위드 리소스 생김.
			// 객체생성인데 왜 new가 안보이냐 ... 인터페이스이기 때문...
			// 객체생성하려면 팩토리 메서드 사용해서 객체 생성해야됨..
			
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("writedate")+"\t");
				System.out.println(rs.getString("memo"));
				// 행단위로 옮겨가는것.
			}
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);
		} 
	}
}
