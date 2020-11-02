<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<script src="http://code.jquery.com/jquery.js"></script>
<style>
* {
	margin: 0;
	padding: 0;
}

body {
	padding: 100px;
}

h1 {
	margin-bottom: 10px;
}

a:link {
	color: red;
	text-decoration: none;
}

a:visited {
	color: black;
	text-decoration: none;
}
div{
	padding-top: 5px;
	padding-bottom: 5px;
}
</style>
<body>
	<h1>회원가입</h1>
	<div id="container">
		<form action="" method="post">
			<div>
				<label for="signUpId">아이디</label> <input type="text" id="signUpId" />
			</div>
			<div>
				<label for="signUpPw">비밀번호</label> <input type="text" id="signUpPw" />
			</div>
			<div>
				<input type="submit" value="등록" /> <input type="reset" value="초기화" />
				<button>
					<a href="/board/main">뒤로가기</a>
				</button>
			</div>
		</form>
	</div>
</body>
<script>
	
</script>
</html>