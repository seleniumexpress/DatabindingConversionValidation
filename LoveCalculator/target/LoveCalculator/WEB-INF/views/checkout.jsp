<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
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
</style>
</head>
<body>
<h3 align="center">Enter Your Payment Details</h3>
<hr>
<div align="center">
<form:form modelAttribute="checkoutdto" action="checkout-output" method="post">
<p>
<form:label path="creditcard">Card Details :</form:label>
<form:input path="creditcard"/>
<form:errors path="creditcard" cssClass="error"></form:errors>
</p>
<p>
<form:label path="price">Amount :</form:label>
<form:input path="price"/>
<form:errors path="price" cssClass="error"></form:errors>
<%-- <form:errors path="price.amount" cssClass="error"></form:errors> --%>
</p>
<p>
<form:label path="age">AGE :</form:label>
<form:input path="age"/>
<form:errors path="age" cssClass="error"></form:errors>
</p>
<input type="submit" value="Pay Now">

</div>







</form:form>


</body>
</html>