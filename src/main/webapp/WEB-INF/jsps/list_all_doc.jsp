<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<h2>List All Doctors</h2>
<table>
<tr>
<table border ="1">
<th>First name</th>
<th>Last name</th>
<th>Email</th>
<th>Mobile number</th>

</tr>

<c:forEach var = "doctors" items ="${doctors}">
<tr>
<td>${doctors.fname}</td>
<td>${doctors.lname}</td>
<td>${doctors.email}</td>
<td>${doctors.mobile}</td>

</tr>
</c:forEach>









</table>

<meta charset="ISO-8859-1">
<title>Insert title here</title>     
</head>
<body>

</body>
</html>