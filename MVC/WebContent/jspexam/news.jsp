<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.vo.NewsVO, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1{
text-align : center;
margin : 0 auto;
}
h2{
text-align : center;
margin : 0 auto;
}
div{
display : none;
border : 1px solid black;
}
td{
border-bottom :2px dotted green;
}
table{
margin : 0 auto;
}
.inputForm{

width : 300px;
}
.inputForm2{
width : 430px;
height : 250px;
}
form{
margin : 0 auto;
}
#kim{
font-family: "Times New Roman", Times, serif;
}
</style>
</head>
<body>

<a href="http://70.12.115.176:8000/mvc/news"><img src="http://70.12.115.176:8000/mvc/images/kbs로고.PNG" ></a>
<%
		List<NewsVO> list = (List<NewsVO>)request.getAttribute("list");

	%>

<% 
	if(list!=null){
%>
    	<h2 id="kim">김동규 게시판</h2>
    	<hr>
    	<table>
    		<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>    
<%	
    	for(NewsVO vo : list) { 	   
%>
			<tr>
				<td><%= vo.getId()%></td>
				<td><a href="http://70.12.115.176:8000/mvc/news?action=read&newsid=<%=vo.getId()%>" style="text-decoration:none"><%= vo.getTitle() %></a></td>
				<td><a href="http://70.12.115.176:8000/mvc/news?action=listwriter&searchvalue=<%=vo.getWriter()%>" style="text-decoration:none"><%= vo.getWriter() %></a></td>		
				<td><%= vo.getWritedate() %></td>
				<td><%= vo.getCnt() %></td>
			</tr>
<%
    	}
%>
    	</table>
    	<br>

<form action="/mvc/news" method="GET">
    <select name="action">
		<option  value="search">제목</option>
		<option  value="listwriter">작성자</option>
	</select>
	<input type = "search" name = "searchvalue" autocomplete="off">
	<input type="submit" value="뉴스검색" autocomplete="off">
	
</form>

<br>
<br>
<%
NewsVO vo1 = (NewsVO)request.getAttribute("vo1"); 

	if(vo1!=null){%>
	<hr>
<div id="reWriteForm" style="display : block">
<h1>뉴스 수정</h1>
<form method="POST" action="/mvc/news">
<input type="hidden" name="action" value="update">
<input type="hidden" name="newsid" value="<%=vo1.getId()%>">
기자명<input type="text" placeholder="작성자명을 입력해주세요" name="writer" id="writer_name"  value="<%=vo1.getWriter()%>"><br>
제목<input class="inputForm"type="text" placeholder="제목을 입력해주세요" name="title" size="40"  value="<%=vo1.getTitle() %>" ><br>
내용<input class="inputForm2" placeholder="내용을 입력해주세요." name="content"  value="<%=vo1.getContent() %>"></input><br>
<input type="button" value="확인" onclick="undisplayForm()">
<input type="submit" value="수정">
<input type="button" value="삭제" onclick="location.href='/mvc/news?action=delete&newsid=<%=vo1.getId()%>'">
</form>
</div>
<br>

<%-- <div id=deleteBtn  style="display : block">
<form action="/mvc/news?action=delete&newsid=<%=vo1.getId()%>" method="GET">
<input type="button" value="삭제">
</form>
</div> --%>
<% 
	}

	}else{
%>
		<h1>없당</h1>
		<h2>${msg}</h2>
<%
	}
%>

<button onclick="displayForm(1)">뉴스작성</button>
<div id="writeForm" style="display : none">
<form method="POST" action="/mvc/news">
<input type="hidden" name="action" value="insert">
<h1>뉴스 작성</h1>
기자명<input type="text" placeholder="작성자명을 입력해주세요" name="writer" autocomplete="off" ><br>
제목<input class="inputForm" type="text" placeholder="제목을 입력해주세요" name="title" autocomplete="off"  ><br>
내용<input class="inputForm2" placeholder="내용을 입력해주세요." name="content" autocomplete="off"  ></input><br>
<input type="submit" value="저장">
<input type="reset" value="재작성">
<input type="button" value="취소" onclick="displayForm(2)">
</form>
</div >


<script>
function displayForm(type){
	if(type == 1) {
		document.getElementById("writeForm").style.display='block';
		document.getElementById("reWriteForm").style.display='none';
		document.getElementById("deleteBtn").style.display='none';
	} else if(type == 2) {
		document.getElementById("writeForm").style.display='none';
	}	
}
function displayContent(id){
		var dom = document.getElementsByClassName()
		document.getElementById("writeForm").style.display='none';
		document.getElementById("reWriteForm").style.display='block';
		document.getElementById("deleteBtn").style.display='block';
		document.getElementById("writer_name").value = dom[0].textContext;
}
function undisplayForm(){
	document.getElementById("reWriteForm").style.display='none';
	document.getElementById("deleteBtn").style.display='none';
}
</script>
<footer>
<img src="http://70.12.115.176:8000/mvc/images/kbs로고2.png">
</footer>
</body>
</html>