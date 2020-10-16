package model.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.vo.VisitorVO;

public class VisitorMybatisDAO {
	final String resource = "resource/mybatis-config.xml"; // src 폴더 기준
	public List<VisitorVO> listAll() {
		System.out.println("Mybatis 를 사용 DB 연동-listAll");
		List<VisitorVO> list = null;
		SqlSession session = null;
		try {
			InputStream inputStream =
					Resources.getResourceAsStream(resource);
			// 빌드매서드에게 주게되는데 이때 지정된 파일은 리소스/마이바티스-콘피크.xml 꼭 src 안에 있어야 인식이 됨.
			// 접속할 DB서버에 대한 정보..
			
			SqlSessionFactory sqlSessionFactory =
					new SqlSessionFactoryBuilder().build(inputStream);
			// SqlSession 객체가 생성될 때 내부적으로 다 인식하게 되는 결과
			// 커넥션과 프리페어드스테이트먼트를 하나로 묶어 놓은 결과
			// Sql세션 생성되는것은 디비 접속은 끝난것이고 프리패어드 스테이트먼트가 준비되어 있다 라는 뜻.
			// 수행하고자하는 sql문을 맵퍼파일에서 찾아오고, 어떤 에스큐엘 명령이냐에 따라서 인서트 업데이트 등의 아이디값 앞에 네임스페이스값을 지정해서 사용했었음.
			session = sqlSessionFactory.openSession();
			String statement = "resource.VisitorMapper.selectVisitor";
			// 네임스페이스 이름.. 비치터맵퍼라는 네임스페이스
			list = session.selectList(statement); //리스트 객체가 리턴됨.
			//하나 또는 몇개이상을 받아올 때 selectList 또는 selectOne으로 구분됨.
			System.out.println(session.getClass().getName());	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public List<VisitorVO> search(String keyword) {
		System.out.println("Mybatis 를 사용 DB 연동-search");
		List<VisitorVO> list = null;
		SqlSession session = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			String statement = "resource.VisitorMapper.searchVisitor";
			list = session.selectList(statement, keyword);
			 //리스트 객체가 리턴됨.
			//하나 또는 몇개이상을 받아올 때 selectList 또는 selectOne으로 구분됨.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;		
	}

	public boolean insert(VisitorVO vo) {
		System.out.println("Mybatis 를 사용 DB 연동-insert");
		boolean result = false;
		SqlSession session = null;
		try {
			InputStream inputStream = 
					Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession(true);
			// openSession(true)...
			// 리스트올, 셀렉트는 아규먼트 안줬음..
			// true를 주게되면 JDBC는 기본적으로 오토커밋임. 마이바티스를 만든사람들은 이게 마음에 안들어서
			// 마이바티스는 기본적으로 오토커밋이 아님!!
			// sql세션객체를 만들때 아규먼트를 트루로 주게되면 오토커밋으로 적용됨.
			// false를 주거나 안주면 오토커밋 아님..
			String statement = "resource.VisitorMapper.insertVisitor";
			if(session.insert(statement, vo) == 1)
				result = true;
			//파라미터형이 비지터 vo니까.. 
			// 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null)
				session.close();
		}
		return result;
	}
}
