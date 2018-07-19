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
<link rel='stylesheet' type="text/css"
	href='cssFile/Sign_In_Decorate.css'>
<title>Main-Page</title>
</head>
<body style="background: black">

	<div style='display: inline;'>
		<div style='float: left; width: 15%; height: 50px;'>
			<ul>
				<li><a style="color: red;" href="musicManage">My Music</a></li>
			</ul>
		</div>
		<div style='float: left; width: 35%; height: 50px;'>
			<form action="serachMusic">
				<input class="cc" style="color: white;" type="text"
					autocomplete="off" name="music_name" placeholder="Serach Music"
					size="50"> <input class="register_button" type="submit"
					value="Enter" size="50">
			</form>
		</div>
		<div style='width: 20%; float: left; height: 50px;'>
			<img style="width: 40px; height: 40px;" alt="add Music"
				src="files/add.png"
				onclick="javascrtpt:window.location.href='add_music.jsp'">
		</div>
		<div
			style='float: right; width: 30%; text-align: right; color: red; height: 50px; font-weight: bold;'>
			<font style="font-size: 20px;"><img
				style="height: 30px; width: 30px; border: none;"
				src="files/userPhotos/${user.head_Icon_Address }"
				onclick="javascrtpt:window.location.href='head_icon.jsp'" />&nbsp;&nbsp;
				${user.name } &nbsp;&nbsp;</font> <a href="index.jsp">Log Out</a>&nbsp;&nbsp;&nbsp;&nbsp;
		</div>
	</div>
	<hr style="background-color: red; border-color: red" />
	<div class="div">
		&nbsp;&nbsp;&nbsp;&nbsp;<img src="files/icon.png">
	</div>
	<div>
		<table cellspacing="0" cellpadding="0" border="0">
			<tr>
				<th width="30px">Order</th>
				<th width="250px">Name</th>
				<th width="200px">Author</th>
				<th width="30px">Time</th>
				<th width="200px">Control</th>
			</tr>

			<c:forEach var="music" items="${musicList }" varStatus="vs">
				<tr align="center">
					<td>${vs.count }</td>
					<td style="color: #FFFF00;">${music.music_name }</td>
					<td style="color: #7FFFD4;">${music.music_author }</td>
					<td>${music.music_time }</td>
					<td><a style="color: #66FF00"
						href="http://music.163.com/song/media/outer/url?id=${music.music_address }.mp3">Play</a>&nbsp;
						<a style="color: #FFCC00;" href="editMusic?music_id=${music.music_id }">Alt</a>&nbsp; <a
						style="color: #CC00FF;"
						href="deleteMusic?music_id=${music.music_id }"
						onclick="if(confirm('Are You Sure Delete')==false) return false;">Del</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>