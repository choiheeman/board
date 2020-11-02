<%@page import="com.sample.model.BoardVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<html>
<head>
<title>게시판</title>
</head>
<script src="http://code.jquery.com/jquery.js"></script>
<style>
* {
	margin: 0;
	padding: 0;
}

#container {
	margin: 100px;
	width: 1000px;
}

h1 {
	margin-bottom: 10px;
}

#checks {
	display: flex;
	justify-content: space-between;
}

table {
	margin-top: 5px;
	border-collapse: collapse;
	width: 100%;
}

tr {
	border: 1px solid black;
}

td {
	text-align: center;
}
</style>
<body>
	<div id="container">
		<h1>게시판 목록</h1>
		<div id="checks">
			<form action="">
				<input type="text" /> <input type="submit" value="검색" /> <input
					type="reset" value="초기화" />
			</form>
			<button>글쓰기</button>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th>작성날짜</th>
			</tr>

			<%
				List<BoardVo> boardVo = (List<BoardVo>) request.getAttribute("boardList");
				for (int i = 0; i < boardVo.size(); i++) {
				BoardVo vo = boardVo.get(i);
			%>
			<tr>
				<td><%=vo.getIdx() %></td>
				<td><a href="#"><%=vo.getTitle() %></a></td>
				<td><%=vo.getContent() %></td>
				<td><%=vo.getWriter() %></td>
				<td><%=vo.getWriterDate() %></td>
			</tr>
			<%
				}
			%>				
		</table>
	</div>
</body>
</html>
