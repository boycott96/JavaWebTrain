<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel='stylesheet' type='text/css' href='cssFile/Input_Decorate.css'>
<link rel='stylesheet' type="text/css" href='cssFile/Main_css.css'>
<title>Main-Page</title>
</head>
<body style="background: black">

	<div style='display: inline;'>
		<div style='float: left; width: 50%'>
			<ul>
				<li><a style="color: red;" href="home_page.jsp">My Music</a></li>
			</ul>
		</div>
		<div style='float: right; width: 50%; text-align: right'>
			<ul>
				<li>{$username}</li>
			</ul>
		</div>
	</div>
	<hr style="background-color: red; border-color: red" />
	
</body>
</html>