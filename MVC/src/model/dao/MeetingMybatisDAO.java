package model.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.vo.MeetingVO;

public class MeetingMybatisDAO implements MeetingDAO {
	final String resource = "resource/mybatis-config.xml";
	SqlSessionFactory sqlSessionFactory;

	public MeetingMybatisDAO() {
		try {
			InputStream InputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(InputStream); // Builder()
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<MeetingVO> listAll() {
		System.out.println("Mybatis를 이용한 게시판 실습 - meeting - listAll()");
		List<MeetingVO> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		String statement = "resource.MeetingMapper.selectMeeting";
		list = session.selectList(statement);
		System.out.println(session.getClass().getName());
		session.close();
		return list;
	}
	
	@Override
	public List<MeetingVO> search(String keyword) {
		System.out.println("Mybatis를 이용한 게시판 실습 - meeting - search()");
		List<MeetingVO> list = null;
		SqlSession session = sqlSessionFactory.openSession();
		String statement = "resource.MeetingMapper.searchMeeting";
		
		list = session.selectList(statement, keyword);
		session.close();
		return list;
	}
	
	@Override
	public boolean insert(MeetingVO vo) {
		System.out.println("Mybatis를 이용한 게시판 실습 - meeting - insert()");
		boolean result = false;
		SqlSession session = sqlSessionFactory.openSession();
		String statement = "resource.MeetingMapper.insertMeeting";
		
		if(session.insert(statement,vo)==1)
			result = true;
		session.close();
		System.out.println(result);
		return result;
	}



	@Override
	public boolean delete(int eNo) {

		return false;
	}
	@Override
	public boolean update(MeetingVO vo) {

		return false;
	}

}
