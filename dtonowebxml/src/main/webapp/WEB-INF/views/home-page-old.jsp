<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>

<div align="center"><form action="processBest" method="get">
		<p>
			<label for="yourName">Your Name : </label> <input type="text"
				name="yourName" id="yourName" placeholder=${userInfoDto.yourName}>
		</p>
		<p>
			<label for="crushName">Crush Name : </label> <input type="text" name="crushName"
				id="crushName" placeholder=${userInfoDto.crushName}>
		</p>
		<input type="submit" name="Submit">
	</form>
</div>
	

</body>
</html>