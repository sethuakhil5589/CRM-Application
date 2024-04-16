<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>update form</title>
  <link rel="stylesheet" href="css/style.css"> </head>
<body>
<center>
<div>
    <h1>Update Form</h1>
    <form:form method="post" modelAttribute="customer" style="border: 1px solid #ddd; padding: 20px; width: 400px; margin: 0 auto;">
		<label for="firstName">First Name:</label>
		<form:input path="firstName" style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 3px;"/><br><br>

        <label for="lastName">Last Name:</label>
        <form:input path="lastName" style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 3px;"/><br><br>

        <label for="city">City:</label>
        <form:input path="city" style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 3px;"/><br><br>

        <button type="submit" value="register" style="background-color: #4CAF50; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;">Submit</button>
</form:form>
</div>
</center>
</body>
</html>
