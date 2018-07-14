<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel='stylesheet' type='text/css' href='cssFile/Input_Decorate.css'>
<link rel='stylesheet' type='text/css' href='cssFile/log_In_Decorate.css'>
<title>Log-In-Page</title>
</head>
<body style="background: #B0C4DE">
	<div class="item">
		<h1>LOGIN</h1>
		<br>
		<form action="log_In" method="post">
			<input class="cc" type="text" autocomplete="off" name="username"
				placeholder="USERNAME" size="50"> <br>
			<br> <input class="cc" type="password" name="password"
				placeholder="PASSWORD" size="50"><br>
			<br>
			<div style='display: inline;'>
				<div style='float: right;'>
					<input class='log_in_button' type="submit" value="LOGIN">
				</div>
				<div style='float: left'>
					<input class='register_button' type='button' value="SINUP"
						onclick="javascrtpt:window.location.href='register.jsp'">
				</div>
			</div>
		</form>
	</div>
</body>
</html>