<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
</head>
<body>
	<form id="join-form" name="joinForm" method="post" action="/hellospring/user/join">
	
		<label class="block-label" for="name">이름</label>
		<input id="name" name="name" type="text" value="">
		<br><br>
		
		<label class="block-label">이메일</label>
		<input name="email" type="email" value="">
		<br><br>
		
		<label class="block-label">패스워드</label>
		<input name="password" type="password" value="">
		<br><br>
					
		<label>여</label> <input type="radio" name="gender" value="FEMALE" checked="checked">
		<label>남</label> <input type="radio" name="gender" value="MALE">
		<br><br>
					
		<input type="submit" value="가입하기">
					
	</form>
</body>
</html>