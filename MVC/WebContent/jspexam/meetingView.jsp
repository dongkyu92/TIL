<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.vo.MeetingVO" import="model.dao.MeetingJDBCDAO"
    import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
border : 1px solid black;
}
th{
width : 200px;
border : 1px solid black;
}
img{
width : 50px;
}
</style>
</head>
<body>
<%
	List<MeetingVO> list = (List<MeetingVO>)request.getAttribute("list");
if (list != null) {
%>
    	<h2>방명록 글 리스트</h2><hr>
    	<table> 
    	<tr>
    		<th>이름</th>
    		<th>제목</th>
    		<th>작성일시</th>
    		<th>수정 및 삭제</th>
    	</tr>
<%	
    	for(MeetingVO vo : list) { 	   
%>

			<tr>
				<td><%= vo.getName() %></td>
				<td><%= vo.getTitle() %></td>
				<td><%= vo.getMeetingDate() %></td>
				<td><a href="http://localhost:8000/mvc/meeting?action=del&id=<%=vo.getId() %>"><img src="http://localhost:8000/mvc/images/delete.png"></a>	
			</tr>
<%
    	}
%>
   </table>
   <a href="http://localhost:8000/mvc/htmlexam/meetingForm.html">미팅정보 입력으로 돌아가기</a>
   <%
    } else {
%>
		<h2>${msg}</h2>
<%
    }
%>
</body>
</html>