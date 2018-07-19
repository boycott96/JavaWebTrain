<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel='stylesheet' type='text/css' href='cssFile/Input_Decorate.css'>
<link rel='stylesheet' type="text/css" href='cssFile/Main_css.css'>
<link rel='stylesheet' type="text/css"
	href='cssFile/Sign_In_Decorate.css'>
<title>Head-Icon</title>
</head>
<body style="background: black">

	<div style='display: inline;'>
		<div style='float: left; width: 50%; height: 50px;'>
			<ul>
				<li><a style="color: red;" href="musicManage">My Music</a></li>
			</ul>
		</div>
		<div
			style='float: right; width: 50%; text-align: right; color: red; height: 50px; font-weight: bold;'>
			<font style="font-size: 20px;"><img
				style="height: 30px; width: 30px;"
				src="files/userPhotos/${user.head_Icon_Address }" /> ${user.name }
				&nbsp;&nbsp;</font> <a href="index.jsp">Log Out</a>&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
	</div>
	<hr style="background-color: red; border-color: red" />
	<div class="div">
		&nbsp;&nbsp;&nbsp;&nbsp;<img src="files/icon.png">
	</div>
	<div>
		<br> <br> <br>

		<form style="color: white;" action="addHeadIcon" method="post"
			enctype="multipart/form-data">
			<img style="height: 70px; width: 70px;"
				src="files/userPhotos/${user.head_Icon_Address }" /> <font
				style="color: white;">Select the avatar you want to convert
				--></font> <input type="file" name="head_icon"> <input
				type="submit" value="Enter">
		</form>
	</div>
</body>
</html>