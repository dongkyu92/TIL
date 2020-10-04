package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MeetingJDBCDAO;
import model.dao.MeetingMybatisDAO;
import model.vo.MeetingVO;

/**
 * Servlet implementation class MeetingServlet
 */
@WebServlet("/meeting")
public class MeetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet 함수 실행");
		//전체 리스트출력, 검색, 삭제
		String keyword = request.getParameter("keyword");
		
		MeetingMybatisDAO dao = new MeetingMybatisDAO();
		String id = request.getParameter("id");
	
		if (keyword == null) { //삭제나 리스트 출력일 경우
			System.out.println("삭제나 리스트 출력일 경우");
			if(request.getParameter("action")!=null) {
			  if(request.getParameter("action").equals("del"))
			  { //삭제일경우
				System.out.println("삭제 들어옴");
				boolean result = dao.delete(Integer.parseInt(id));
				
				if(result)
					request.setAttribute("msg", "성공적으로 삭제 되었습니다.");
				else
					request.setAttribute("msg", "삭제에 실패 했습니다.");
			}}
				// 리스트출력
				List<MeetingVO> list = dao.listAll();
				System.out.println("2");
				for (MeetingVO vo : list) {
					System.out.println(vo);
				}
				request.setAttribute("list", list);
			
		} else { // 검색일 경우
			System.out.println("검색 실행");
			List<MeetingVO> list = dao.search(keyword);
			if (list.size() == 0) {
				request.setAttribute("msg", keyword + "를 담고있는 글이 없어용");
			} else {
				request.setAttribute("list", list);
			}
		}
		request.getRequestDispatcher("/jspexam/meetingView2.jsp").forward(request, response);
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {  
		//미팅정보 작성
		
		request.setCharacterEncoding("UTF-8");		
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String meetingDate = request.getParameter("meetingDate");
		MeetingMybatisDAO dao = new MeetingMybatisDAO();
		MeetingVO vo = new MeetingVO();
		vo.setName(name);
		vo.setTitle(title);
		vo.setMeetingDate(meetingDate);
		
		boolean result = dao.insert(vo);
		List<MeetingVO> list =dao.listAll(); // 디비에 있는 모든 리스트를 list에 담음.
		
		if(result) {
			request.setAttribute("list", list);	
			request.getRequestDispatcher("/jspexam/meetingView2.jsp").forward(request, response);
		}
		else 
			request.setAttribute("msg", "글 작성 실패");
}
}
	


