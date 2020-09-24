package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadVisitor2 {

	public static void main(String[] args) throws Exception {
//1. JDBC Driver 로딩 - Class.forName() (예외처리 필수)
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 클래스라는 이름의 클래스가 있는데 아규먼트는 오라클용 jdbc드라이버의 대장클래스를 지정한거임
//2. DBMS 에 접속 - (클래스) DriverManager.getConnection("jdbc url", "계정", "암호")
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest"); // @안주면 서버주소 인식 못함.,
		//잘 연결 되었으면 컨넥션 객체 리턴..
		System.out.println(conn); // ToString
		//여기까지 실행하면 oracle.jdbc.driver.T4CConnection@31a5c39e 뜸...
		//실제 리턴된 객체가 쟤라는 소리..
		
//3. Statement/PreparedStatement 객체 생성
		Statement stmt = conn.createStatement();
//4. 처리하려는 기능에 따라서 SQL 문을 전달하고 수행시킨다.
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요 : ");
		String searchName = scan.nextLine();
		scan.close();
		String sql = "select name, writedate, memo from visitor " + "where name = '"+searchName+"'"; //세미콜론 ㄴㄴ
		ResultSet rs = stmt.executeQuery(sql);
		//셀렉트의 검색결과가 없을 때, 비어있는 리절트 셋이 리턴..
//5. 결과 처리
//   - ResultSet 객체
//   - next() : 행단위로 옮겨다니는 메서드, getXXX(): 행들의 컬럼값 읽기. (ex) date형이면 getDate())
		
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
//   - Select 명령의 수행 결과 여부에 관계없이 ResultSet 객체는 리턴.
//   - next()에서 처음 추출된 리턴값이 없으면 값을 읽지 못했다 ---> 로그인시 활용.

//6. 종료시 close() 필수..! 웹프로그래밍 특성상 종료안하면 사용도 안하면서 계속 붙들어놓음.
	}

}
