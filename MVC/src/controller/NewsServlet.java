package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.MeetingDAO;
import model.dao.MeetingJDBCDAO;
import model.dao.NewsDAO;
import model.vo.MeetingVO;
import model.vo.NewsVO;

/**
 * Servlet implementation class NewsServlet
 */
@WebServlet("/news")
public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet호출");
		String action = request.getParameter("action");
		String newsid = request.getParameter("newsid");
		System.out.println("doGet호출 후 받아온 newid 값 :"+newsid);
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String searchvalue = request.getParameter("searchvalue");
		NewsDAO dao = new NewsDAO();
		if(action == null) {  // 파라미터 없이 전달시 뉴스 게시글을 그냥 출력.
			List<NewsVO> list = dao.listAll();
			for(NewsVO vo : list) {
				System.out.println(vo.getId());
			}
			request.setAttribute("list", list);
			request.getRequestDispatcher("/jspexam/news.jsp")
	        .forward(request, response);
		} else { // 파라미터 전달 시. 제목 클릭 -> id를 기준으로 content 출력.
			System.out.println("else에 들어옴");
			if(action.equals("read")){
				/*
				 * request.setAttribute("newsid",newsid); request.setAttribute("writer",writer);
				 * request.setAttribute("title",title); request.setAttribute("content",content);
				 */
				
				System.out.println("read에 들어옴");
				
				System.out.println("read에 들어옴 다음 newid값"+Integer.parseInt(newsid));
				NewsVO vo1 = dao.listOne(Integer.parseInt(newsid));
				
				request.setAttribute("vo1", vo1);
				System.out.println("-------------vo1.getTitle() 값----------:" +vo1.getTitle());
				List<NewsVO> list = dao.listAll();
				request.setAttribute("list", list);
				
				System.out.println("뉴스아이디의값" +newsid);
					request.getRequestDispatcher("/jspexam/news.jsp?action=read&newsid="+newsid)
			        .forward(request, response);
		}
			else if(action.equals("delete")) {
				System.out.println("삭제 들어옴");
				boolean result = dao.delete(Integer.parseInt(newsid));
				if(result) {
					System.out.println("삭제성공");
				}
				else {
					System.out.println("삭제실패");
				}
				List<NewsVO> list = dao.listAll();
				request.setAttribute("list", list);
				request.getRequestDispatcher("/jspexam/news.jsp")
		        .forward(request, response);
			}
			else if(searchvalue!=null){
				if(action.equals("search")) {
					System.out.println("제목 검색 들어옴");
					List<NewsVO> list = dao.search(searchvalue, action);
					request.setAttribute("list", list);
					request.getRequestDispatcher("/jspexam/news.jsp")
			        .forward(request, response);
				}
				else if(action.equals("listwriter")) {
					System.out.println("작성자 검색 들어옴");
					List<NewsVO> list = dao.listWriter(searchvalue);
					request.setAttribute("list", list);
					request.getRequestDispatcher("/jspexam/news.jsp")
			        .forward(request, response);
				}
					
			}
			
			
	}
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action"); // action = insert.
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String newsid = request.getParameter("newsid");
		System.out.println("포스트함수의 뉴스아이디값" + newsid);

		NewsDAO dao = new NewsDAO();
		NewsVO vo = new NewsVO();
		vo.setWriter(writer);
		vo.setTitle(title);
		vo.setContent(content);
		if(action.equals("insert")) { // 뉴스 작성(폼을 통해 작성이 입력된다면.)
			boolean result = dao.insert(vo);
			List<NewsVO> list = dao.listAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("/jspexam/news.jsp");
		} else { // 뉴스 수정(폼을 통해 재작성이 눌러진다면)
			if(action.equals("update")) {
				System.out.println("업데이트 들어옴");
				NewsVO vo1 = dao.listOne(Integer.parseInt(newsid));
				vo1.setTitle(title);
				vo1.setWriter(writer);
				vo1.setContent(content);
				boolean result = dao.update(vo1);
				if(result) {
					System.out.println("수정성공");
				}
				else {
					System.out.println("수정실패");
				}
				List<NewsVO> list = dao.listAll();
			}
		}
		request.setAttribute("list", dao.listAll());
		request.getRequestDispatcher("/jspexam/news.jsp").forward(request, response);
	}
	}
