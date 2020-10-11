package model.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.vo.NewsVO;


class NewsDAOTest {
	
	@Test
	void test0() {
		System.out.println("----------------");
		NewsDAO dao = new NewsDAO();
		List<NewsVO> list = dao.listAll();
		System.out.println(dao.listOne(27));
			
		System.out.println("----------------");
	}
	@Test
	void test2() {
		NewsDAO dao = new NewsDAO(); // 같은 패키지에 있기 때문에 임포트 필요 ㄴ
		List<NewsVO> list = dao.listAll();
		System.out.println(list.size());
		for(NewsVO vo : list) {
			System.out.println(vo);
		}
	}
	/*
	 * @Test void test1() { System.out.println("검색 기능 테스트"); VisitorDAO dao = new
	 * VisitorDAO(); // 같은 패키지에 있기 때문에 임포트 필요 ㄴ List<VisitorVO> list =
	 * dao.search("배고파"); System.out.println(list.size()); for(VisitorVO vo : list)
	 * { System.out.println(vo); } }
	 */
	
	@Test
	void test() {
		System.out.println("삽입 기능 테스트");
		NewsDAO dao = new NewsDAO(); // 같은 패키지에 있기 때문에 임포트 필요 ㄴ
		NewsVO vo = new NewsVO();
		
		vo.setWriter("테스트1");
		vo.setTitle("테스트1");
		vo.setContent("배고프당");
		vo.setWritedate("2019-07-01T13:40");
		vo.setCnt(1);

		boolean result = dao.insert(vo);
		if(result)
			System.out.println("삽입 성공");
		else
			fail("삽입실패");
		}

}
