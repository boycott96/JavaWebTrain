<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel='stylesheet' type='text/css' href='cssFile/Input_Decorate.css'>
<link rel='stylesheet' type="text/css" href='cssFile/Main_css.css'>
<link rel='stylesheet' type="text/css" href='cssFile/Sign_In_Decorate.css'>
<link rel='stylesheet' type="text/css" href='cssFile/slide.css'>
<title>Music-List</title>
</head>
<body style="background: black">
	<nav>
	<ul class="main">
		<li><a class="ahref" href="index.html">Home</a>
		<li><a class="ahref" href="music_list.jsp">List Music</a></li>
		<li><a class="ahref" href="sign_Out">Sign Out</a></li>
		<li><a class="ahref" href="#">about</a>
			<ul class="drop menu6">
				<li><a class="ahref" href="team.html">Team</a></li>
				<li><a class="ahref" href="https://github.com/huaisun/JavaWebTrain"></a>Code</li>
			</ul></li>
		<li><a class="ahref" href="head_icon.jsp">Name: ${user.name }</a></li>
	</ul>
	</nav>
	<font color="white">&nbsp;&nbsp;&nbsp;&nbsp;List
		Music&nbsp;&nbsp;&nbsp;&nbsp;Star: 9999 times</font>
	<br>
	<div>
		<table>
			<tr>
				<th width="200px;" height="180px;"><a href="listeningCharts"><img
						width="150px;" alt="" src="files/one.jpg"></a></th>
				<th width="200px;" height="180px;"><a href="musicManage"><img
						width="150px;" alt=""
						src="files/userPhotos/${user.head_Icon_Address }"></a></th>
			</tr>
			<tr>
				<td width="200px;" align="center"><font color="white">Listening
						charts</font></td>
				<td width="200px;" align="center"><font color="white">My
						favorite song list</font></td>
			</tr>
		</table>
	</div>
</body>
</html>