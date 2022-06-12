    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function validation() {
	var name=document.getElementById("name");
	var labelname=document.getElementById("labelname");
	var userName=document.getElementById("userName");
	var password=document.getElementById("password");
	if ((userName.value.length > 7 && userName.value.length < 16) && (password.value.length > 7 && password.value.length < 16) && (terms.value == true)) {
		return true
	}
	else {
		alert("Enter valid details. \r\n Please Check your Username, Password combination and T&C checkbox")
		//name.style.highlight="red";
		return false
	}
	
}
</script>
<style type="text/css">
.error{
position:fixed;
text-align: left;
color: red; 
margin-left: 30px;

}
.error1{
text-align: center;
color: red; 
margin-left: 30px;

}
.para1{

margin-right:50px;
}
</style>
</head>
<body>

<h2 align="center">Sign-In</h2>
<div align="right">
<a href="http://localhost:8081/LoveCalculator/register">Register</a>
</div><hr>
<div align="center">
<form:form action="signIn-process" method="post" modelAttribute="signInUserInfoDto" onsubmit="validation()">
<p class="para">
<label for="userName">User Name : </label>
<form:input id="userName" path="userName"/>
<form:errors path="userName" cssClass="error"/><br>
</p><br>
<p>
<label for="password">Password : </label>
<form:password id="password" path="password"/>
<form:errors path="password" cssClass="error"/><br>
</p>
<br>
<p>
<form:checkbox path="terms" value="true" label="I confirm to have read and agree to the terms and conditions" id="terms" /><br>
<form:errors path="terms" cssClass="error1"/><br>
</p>
<br>
<input type="submit" value="Sign-In Now" id="register"><br><br><br><br>


</form:form>
</div>


</body>
</html>