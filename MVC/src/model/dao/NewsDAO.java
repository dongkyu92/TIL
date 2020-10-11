package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.vo.MeetingVO;
import model.vo.NewsVO;

public class NewsDAO {

	private Connection connectDB() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		Connection connection = null;
		try{
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","jdbctest","jdbctest");

		}
		catch(SQLException e) {
					e.printStackTrace();
				}

		return connection;
		
	}
	private void close(Connection connection, Statement stmt, ResultSet rs){
		
		try {
			rs.close();
			stmt.close();
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Close 실패");
		}
	}
	public boolean insert(NewsVO vo) {
		boolean result = true;
		Connection connection = connectDB();
		try {
			PreparedStatement pstmt = connection.prepareStatement(
					"insert into news values(news_seq.nextval, ?, ?, ?, sysdate, ?)");
			
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2,vo.getTitle());
			pstmt.setString(3, vo.getContent());
			//pstmt.setString(4, vo.getWritedate());
			pstmt.setInt(4, vo.getCnt());
			pstmt.executeUpdate();
			//close(connection, pstmt, null);
			
		}catch(SQLException e) {
			result = false;
			e.printStackTrace();
		}
		return true;
	}
	public List<NewsVO> listAll(){
		List<NewsVO> list = new ArrayList<>();
		Connection connection = connectDB();
		try {
			Statement stmt =  connection.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select id, writer, title, content, "
					+ "to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"'), cnt from news");
			NewsVO vo;
			while(rs.next()) {
				vo = new NewsVO();
				vo.setId(rs.getInt(1));
				vo.setWriter(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setWritedate(rs.getString(5));
				vo.setCnt(rs.getInt(6));
				list.add(vo);
			}
			close(connection, stmt, rs);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	public boolean update(NewsVO vo) {
		boolean result = true;
		Connection connection = connectDB();
		System.out.println("업데이트함수 들어왔고 아이디값은"+vo.getId());
		System.out.println("업데이트함수 들어왔고 컨텐츠값은"+vo.getContent());
		try{
			PreparedStatement pstmt = connection.prepareStatement(
					"update News set writer = ?, title = ?, content = ?, writedate = sysdate where id = ?");
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setInt(4, vo.getId());
			pstmt.executeUpdate();
			
		}catch(SQLException e){
			result = false;
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean delete(int id) {
		boolean result = true;
	//	List<MeetingVO> list = new ArrayList<>();
		Connection connection = connectDB();
		try{
				Statement stmt = connection.createStatement();
			/*
			 * NewsDAO dao = null; List<NewsVO> list = dao.listAll();
			 * System.out.println("delete함수안의 ");
			 */
				
				int rs = stmt.executeUpdate
				("delete from news where id="+id);
			/*
			 * NewsDAO dao = null; dao.listAll();
			 */
				
				
				stmt.close();
				connection.close();
				
			}catch (SQLException e){
			result = false;
			e.printStackTrace();
		}
		return result;
	}

	public NewsVO listOne(int id) {
		NewsVO vo = null;
		Connection connection = connectDB();
		System.out.println("파트0");
		try{
			System.out.println("파트1");
			PreparedStatement pstmt = connection.prepareStatement(
					"update News set cnt=cnt+1 where id = ?");
			System.out.println("파트2");
			pstmt.setInt(1, id);
			System.out.println("파트3");
			pstmt.executeUpdate();
			System.out.println("파트4");
		}catch(SQLException e){
			System.out.println("파트5");
			e.printStackTrace();
		}
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select id, writer, title, content, to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"'), cnt from News where id="+id);
			rs.next();
			vo = new NewsVO();
			vo.setId(rs.getInt(1));
			vo.setWriter(rs.getString(2));
			vo.setTitle(rs.getString(3));
			vo.setContent(rs.getString(4));
			vo.setWritedate(rs.getString(5));
			vo.setCnt(rs.getInt(6));
			
			close(connection, stmt, rs);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<NewsVO> search(String key, String SearchType){
		List<NewsVO> list = new ArrayList<>();
		Connection connection = connectDB();
		if(SearchType.equals("search")) {
		try{
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery
					("select id, writer, title, content,to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"'), cnt from news where title like '%"+key+"%'");
			NewsVO vo;
			while(rs.next()) {
				vo = new NewsVO();
				vo.setId(rs.getInt(1));
				vo.setWriter(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setWritedate(rs.getString(5));
				vo.setCnt(rs.getInt(6));
				list.add(vo);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return list;
		}
		else {
			try{
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery
						("select id, writer, title, content,to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"'), cnt from news where writer like '%"+key+"%'");
				NewsVO vo;
				while(rs.next()) {
					vo = new NewsVO();
					vo.setId(rs.getInt(1));
					vo.setWriter(rs.getString(2));
					vo.setTitle(rs.getString(3));
					vo.setContent(rs.getString(4));
					vo.setWritedate(rs.getString(5));
					vo.setCnt(rs.getInt(6));
					list.add(vo);
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
			return list;
			
		}
	}
	public List<NewsVO> listWriter(String writer){
		List<NewsVO> list = new ArrayList<>();
		Connection connection = connectDB();
		try{			System.out.println("파트11");
			Statement stmt = connection.createStatement();
			System.out.println("파트22");
			ResultSet rs = stmt.executeQuery
					("select id, writer, title, content,to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"'), cnt from news where writer like '%"+writer+"%'");
			System.out.println("파트33");
			NewsVO vo;
			while(rs.next()) {
				vo = new NewsVO();
				vo.setId(rs.getInt(1));
				vo.setWriter(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setContent(rs.getString(4));
				vo.setWritedate(rs.getString(5));
				vo.setCnt(rs.getInt(6));
				list.add(vo);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return list;
		
	}
	
}
