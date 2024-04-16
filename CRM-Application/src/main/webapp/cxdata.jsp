<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers Data</title>
<link rel="stylesheet" href="css/style.css"> 
</head>
<body>
<h1 style='color:red;text-align:center'>Customer Details</h1>
<center>

<table>
    <tr>
        <th>Customer First Name</th>
        <th>Customer Last Name</th>
        <th>Customer City</th>
        <th>Update</th>
        <th>Delete</th>
        
    </tr>
    <c:forEach var="customer" items="${customers}">
    
        <tr>
        	
            <td>${customer.firstName}</td>
            <td>${customer.lastName}</td>
            <td>${customer.city}</td>
           <td><button class="update" onclick="window.location.href='/CRM/update/${customer.id}'; return false;">UPDATE</button></td>
		           <!--    <td>
		  <form action="/CRM/update" method="post">
		    <input type="hidden" name="customerId" value="${customer.id}" />
		    <button type="submit" class="update">UPDATE</button>
		  </form>
		</td>  -->
            <td><button class="delete" onclick="window.location.href='/CRM/delete/${customer.id}'; return false;">DELETE</button></td>
        </tr>
    </c:forEach>
</table> 
<br>
<button class="register" onclick="window.location.href='/CRM/showform'; return false;">Register</button>
</center>
</body>
</html>