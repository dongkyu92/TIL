<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Object result = request.getAttribute("result");
%>
<h1>연산 요청 결과</h1>
<hr>
결과 : <%=result %>
<a href="<%=request.getHeader("referer") %>">입력화면</a>
</body>
</html>