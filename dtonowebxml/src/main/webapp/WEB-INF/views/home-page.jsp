
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

	<div align="center">
		<form:form action="processBest" method="get" modelAttribute="userInfoDto">
			<p>
				<label for="yourName">Your Name : </label> 
				<form:input path="yourName" id="yourName"/>
			</p>
			<p>
				<label for="crushName">Crush Name : </label> 
				<form:input path="crushName" id="crushName"/>
			</p>
			<input type="submit" name="Submit">
		</form:form>
	</div>


</body>
</html>