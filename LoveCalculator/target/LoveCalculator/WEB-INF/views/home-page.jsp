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
	if (name.value.length > 2 && name.value.length > 2 && name.value.length > 7) {
		
		return true
	}
	else {
		alert("Enter a valid details")
		//name.style.highlight="red";
		return false
	}
	
}
</script>
<style type="text/css">
.error{
align-self: center;
color: red; 

}
</style>
</head>
<body>


<h2 align="center">Love Calculator</h2><hr>
<div align="right">
<a href="http://localhost:8081/LoveCalculator/test">Signin</a>
</div>
<div align="center">
<form:form action="process" method="get" modelAttribute="userInfoDto" onsubmit="validation()">
<p>
<label for="name" id="labelname">Name : </label>
<form:input id="name" path="name"/>
<form:errors path="name"/>
</p>
<p>
<label for="userName">User Name : </label>
<form:input id="userName" path="userName"/>
<form:errors path="userName"/>
</p>
<p>
<label for="password">Password : </label>
<form:password id="password" path="password"/>
</p>
<p>
<form:label path="country">Country : </form:label>
<form:select path="country" id="country">
<form:option value="India" label="India"/>
<form:option value="America" label="America"/>
</form:select>
</p>
<p>
<form:label path="hobby">Hobby : </form:label>
<form:checkbox path="hobby" value="Reading" label="Reading" id="hobby" />
<form:checkbox path="hobby" value="Dancing" label="Dancing" id="hobby"/>
<form:checkbox path="hobby" value="Travelling" label="Travelling" id="hobby"/>
</p>
<p>
<form:label path="gender">Gender : </form:label>
<form:radiobutton path="gender" label="Male" value="Male" id="gender"/>
<form:radiobutton path="gender" label="Female" value="Female" id="gender"/>
</p>
<input type="submit" name="Register" id="register">
</form:form>
</div>



</body>
</html>