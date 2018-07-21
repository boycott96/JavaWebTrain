<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel='stylesheet' type='text/css' href='cssFile/Input_Decorate.css'>
<link rel='stylesheet' type='text/css' href='cssFile/Sign_Up_Decorate.css'>
<title>Sin-Up-Page</title>
</head> 
<body>
<body style="background: #B0C4DE">
	<div class="re_item">
		<h1>SINUP</h1>
		<br>
		<form action="sign_Up" method="post">
			<input class="cc" type="text" autocomplete="off" name="phone_number"
				placeholder="PHONE-NUMBER" size=50> <br> <br>
			<input class="cc" type,="text" autocomplete="off" name="user_name"
				placeholder="USERNAME" size=50> <br> <br> 
			<input class="cc" type="password" name="password" placeholder="PASSWORD"
				size="50"><br> <br> 
			<input class="cc" type="password" name="repassword" placeholder="RE-PASSWORD"
			 	size="50"><br><br>
			<div style='display: inline;'>
				<div style='float: right;'>
					<input class='sure_button' type="submit" value="SURE">
				</div>
				<div style='float: left'>
					<input class='cancel_button' type='button' value="CANCEL"
						onclick="javascrtpt:window.location.href='index.html'">
				</div>
			</div>
		</form>
	</div>
</body>
</body>
</html>