<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel='stylesheet' type='text/css' href='cssFile/Input_Decorate.css'>
<link rel='stylesheet' type="text/css" href='cssFile/Main_css.css'>
<link rel='stylesheet' type="text/css" href='cssFile/table_css.css'>
<link rel='stylesheet' type="text/css" href='cssFile/Sign_In_Decorate.css'>
<link rel="stylesheet" href="cssFile/APlayer.min.css">
<link rel='stylesheet' type="text/css" href='cssFile/slide.css'>

<script src="js/Meting.min.js"></script>
<script src="js/APlayer.min.js"></script>
<title>Listening-Charts</title>
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
	<div style="width: 100%; float: left;">
		<table cellspacing="0" cellpadding="0" border="0">
			<tr>
				<th width="5%">Order</th>
				<th width="20%">Name</th>
				<th width="10%">Author</th>
				<th width="10%">Times</th>
			</tr>

			<c:forEach var="music" items="${musicList }" varStatus="vs">
				<tr align="center">
					<td>${vs.count }</td>
					<td style="color: #FFFF00;">${music.music_name }</td>
					<td style="color: #7FFFD4;">${music.music_author }</td>
					<td style="color: red;">${music.music_time }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>