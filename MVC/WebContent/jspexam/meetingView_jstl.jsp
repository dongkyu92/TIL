<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.vo.MeetingVO"
	import="model.dao.MeetingJDBCDAO" import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- if와 foreach 태그 필요 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>미팅 스케줄(JSTL)</title>
<style>
table {
	border: 1px solid black;
}

th {
	width: 200px;
	border: 1px solid black;
}

td {
	border: 1px solid black;
}

img {
	width: 50px;
}
</style>
</head>
<body>
	<c:if test="${!empty list}">
	<h1>ㅋㅋ</h1>
		<table>
			<tr>
				<td>이름</td>
				<td>미팅내용</td>
				<td>일시</td>
			</tr>
			<c:forEach var="vo" items="${list}" varStatus="status">
				<tr>
					<td>${vo.name}</td>
					<td>${vo.title}</td>
					<td>${vo.meetingDate}</td>
					<td><a href="http://localhost:8000/mvc/meeting?action=del&id=${vo.id}"><img
							src="http://localhost:8000/mvc/images/delete.png"></a>
				</tr>
			</c:forEach>
		</table>

		<a href="http://localhost:8000/mvc/htmlexam/meetingForm.html">미팅정보
			입력으로 돌아가기</a>
	</c:if>

	<c:if test="${!empty list}">
	<h1>안나와</h1>

		
	</c:if>
</body>
</html>