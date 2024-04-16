<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Information Form</title>
  <link rel="stylesheet" href="css/style.css"> 
</head>
<body>
<center>

    <h1>Registration</h1>
    <form:form method="post" modelAttribute="cust">
		<label for="firstName">First Name:</label>
		<form:input path="firstName"/><br><br>

        <label for="lastName">Last Name:</label>
        <form:input path="lastName"/><br><br>

        <label for="city">City:</label>
        <form:input path="city"/><br><br>

        <button type="submit" value="register">Submit</button>
</form:form>

</center>
</body>
</html>