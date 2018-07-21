<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
<title>Main-Page</title>
</head>
<body style="background: black">
	<nav>
	<ul class="main">
		<li><a class="ahref" href="index.html">Home</a>
		<li><a class="ahref" href="music_list.jsp">List Music</a>
			<ul class="drop menu1">
				<li><a class="ahref" href="add_music.jsp">Add Music</a></li>
			</ul>
		</li>
		<li><a class="ahref" href="sign_Out">Sign Out</a></li>
		<li><a class="ahref" href="#">about</a>
			<ul class="drop menu6">
				<li><a class="ahref" href="team.html">Team</a></li>
				<li><a class="ahref" href="https://github.com/huaisun/JavaWebTrain"></a>Code</li>
			</ul></li>
		<li><a class="ahref" href="head_icon.jsp">Name: ${user.name }</a></li>
	</ul>
	</nav>
	<div style="display: inline;">
		<div class="div" style="float: right;">
			&nbsp;&nbsp;&nbsp;&nbsp;<img src="files/icon.png">
		</div>
		<div style="width: 70%; float: left;">
			<table cellspacing="0" cellpadding="0" border="0">
				<tr>
					<th width="30px">Order</th>
					<th width="350px">Name</th>
					<th width="300px">Author</th>
					<th width="200px">Control</th>
				</tr>

				<c:forEach var="music" items="${musicList }" varStatus="vs">
					<tr align="center">
						<td>${vs.count }</td>
						<td style="color: #FFFF00;">${music.music_name }</td>
						<td style="color: #7FFFD4;">${music.music_author }</td>
						<td><a style="color: #66FF00"
							href="musicManage?music_address=${music.music_address }">Play</a>&nbsp;
							<a style="color: #FFCC00;"
							href="editMusic?music_id=${music.music_id }">Alt</a>&nbsp; <a
							style="color: #CC00FF;"
							href="deleteMusic?music_id=${music.music_id }"
							onclick="if(confirm('Are You Sure Delete')==false) return false;">Del</a>
							&nbsp; <a
							style="color: #58FAF4;"
							href="http://music.163.com/song/media/outer/url?id=${music.music_address }.mp3">Down</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div style='float: right; width: 30%; height: 50px;'>
			<form action="serachMusic">
				<input
					style="color: white; width: 300px; height: 40px; background: none; border-color: white; border-left: none; border-right: none; border-top: none; outline: none; padding-left: 10px;"
					type="text" autocomplete="off" name="music_name"
					placeholder="Serach Music" size="50"> <input
					class="register_button" type="submit" value="Serach" size="50">
			</form>	
		</div>
		<div style="width: 30%; float: right;">
			<div class="aplayer" data-id="${music_address }"
				data-server="netease" data-type="song" data-mode="single"
				data-autoplay="true"></div>
		</div>

	</div>
</body>
</html>