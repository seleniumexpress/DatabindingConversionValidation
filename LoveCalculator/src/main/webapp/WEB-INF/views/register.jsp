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
	var username=document.getElementById("userName");
	var labeluserName=document.getElementById("labelusername");
	var password=document.getElementById("password");
	var labelpassword=document.getElementById("labelpassword");
	var country=document.getElementById("country");
	var labelcountry=document.getElementById("labelcountry");
	var gender=document.getElementById("gender");
	var labelgender=document.getElementById("labelgender");
	var terms=document.getElementById("terms");
	if ((name.value.length > 7 && name.value.length < 16) && (userName.value.length > 7 && userName.value.length < 16) && (password.value.length > 7 && password.value.length < 16) && (country.value != "" && country.value != null) && (gender.value != "" && gender.value != null) && (terms.value == true)) {
		return true
	}
	else if((name.value.length <= 7 || name.value.length >= 16) || (userName.value.length <= 7 || userName.value.length >= 16) || (password.value.length <= 7 || password.value.length >= 16) || (country.value == "" || country.value == null) && (gender.value == "" || gender.value == null) || (terms.value == false)){
		alert("Please check the values entered, T&C checkbox \r\n Provide valid details ")
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

}
.para1{

margin-right:50px;
}
</style>
</head>
<body>


<h2 align="center">Love Calculator</h2>
<div align="right" class="para1">
<a href="http://localhost:8081/LoveCalculator/sign-in">Signin</a>
</div>
<hr>

<div align="center">
<form:form action="register-process" method="post" modelAttribute="userInfoDto" onsubmit="validation()">
<p class="para">
<label for="name" id="labelname">Name : </label>
<form:input id="name" path="name"/>
<form:errors path="name" cssClass="error"/><br>
</p>

<p class="para">
<label for="userName" id="labelusername">User Name : </label>
<form:input id="userName" path="userName"/>
<form:errors path="userName" cssClass="error"/><br>
</p>

<p>
<label for="password" id="labelpassword">Password : </label>
<form:password id="password" path="password"/>
<form:errors path="password" cssClass="error"/>
<br>
</p>

<p>
<form:label path="country" id="labelcountry">Country : </form:label>
<form:select path="country" id="country">
<form:option value="" label="Select"/>
<form:option value="India" label="India"/>
<form:option value="America" label="America"/>
</form:select>
<form:errors path="country" cssClass="error"/>
</p>
<p>
<form:label path="hobby">Hobby : </form:label>
<form:checkbox path="hobby" value="Reading" label="Reading" id="hobby" />
<form:checkbox path="hobby" value="Dancing" label="Dancing" id="hobby"/>
<form:checkbox path="hobby" value="Travelling" label="Travelling" id="hobby"/>
</p>
<p>
<form:label path="gender" id="labelgender">Gender : </form:label>
<form:radiobutton path="gender" label="Male" value="Male" id="gender"/>
<form:radiobutton path="gender" label="Female" value="Female" id="gender"/>
<form:errors path="gender" cssClass="error"/>
</p>

<h3>Communication : </h3>
<form:label path="commdto.email" id="labelemail">Email : </form:label>
<form:input path="commdto.email" id="email"/>

<form:label path="commdto.phone" id="labelphone">Phone : </form:label>
<form:input path="commdto.phone" id="phone"/>
<br>
<form:errors path="commdto.email" cssClass="error1"></form:errors>
<form:errors path="commdto.phone" cssClass="error1"></form:errors>


<p>
<form:checkbox path="terms" value="true" label="I confirm to have read and agree to the terms and conditions" id="terms" /><br>
<form:errors path="terms" cssClass="error1"/><br>
</p>


<input type="submit" value="Register Now" id="register">

</form:form>
</div>


</body>
</html>