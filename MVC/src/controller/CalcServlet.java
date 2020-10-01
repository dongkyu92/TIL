package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calcservlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int leftNumber = Integer.parseInt(request.getParameter("leftnumber"));
		int rightNumber = Integer.parseInt(request.getParameter("rightnumber"));
		String operator = request.getParameter("operator");

		String url = "";
		int result = 0;
		RequestDispatcher rd;
		if(operator.equals("/") && rightNumber==0) {
			url = "jspexam/errorResult_EL.jsp";
			request.setAttribute("warning", "나눗셈 연산시 두 번째 숫자는 0일 수 없습니다!!");
		}
		else {
			if(operator.equals("+"))
				result = leftNumber + rightNumber;
			else if(operator.equals("-"))
				result = leftNumber - rightNumber;
			else if(operator.equals("*"))
				result = leftNumber * rightNumber;
			else
				result = leftNumber / rightNumber;
			url = "jspexam/calcResult_EL.jsp";
		}
		
			
			request.setAttribute("result", result); //세션은 체크해야되지만, 리퀘스트는 요청마다 새로 생기기때문에 if로 체크할 필요없다.
			rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}
		

}


