package model.dao;

import static org.junit.jupiter.api.Assertions.*;
import static java.lang.System.out; // 클래스이름을 안주고도 사용하겠다!
import java.util.List;
import org.junit.jupiter.api.Test;
import model.vo.VisitorVO;

class VisitorDAOTest {
	@Test
	void test() {
		VisitorDAO dao = new VisitorDAO(); // 같은 패키지에 있기 때문에 임포트 필요 ㄴ
		List<VisitorVO> list = dao.listAll();
		System.out.println(list.size());
		for(VisitorVO vo : list) {
			System.out.println(vo);
		}
	}
	@Test
	void test1() {
		System.out.println("검색 기능 테스트");
		VisitorDAO dao = new VisitorDAO(); // 같은 패키지에 있기 때문에 임포트 필요 ㄴ
		List<VisitorVO> list = dao.search("배고파");
		System.out.println(list.size());
		for(VisitorVO vo : list) {
			System.out.println(vo);
		}
	}
	
	@Test
	void test2() {
		System.out.println("삽입 기능 테스트");
		VisitorDAO dao = new VisitorDAO(); // 같은 패키지에 있기 때문에 임포트 필요 ㄴ
		VisitorVO vo = new VisitorVO();
		vo.setName("희동이ㅎㅎㅎㅎㅎㅎㅎ");
		vo.setMemo("~~~~오늘은 그냥 금요일~~~~");
		boolean result = dao.insert(vo);
		if(result)
			System.out.println("삽입 성공");
		else
			fail("삽입실패");
		}
}


