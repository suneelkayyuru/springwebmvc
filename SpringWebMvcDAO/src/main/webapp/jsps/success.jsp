<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
</head>
<body>
<h1>Student List..</h1>
<table border="2"  >
<tr><th>SID</th><th>NAME</th><th>GENDER</th><th>ADDRESS</th><th>AGE</th><th>COURSES</th><th>MOBILENO</th></tr>

<tr>
 <td> ${student.sid}</td>
<td> ${student.name}</td>
<td> ${student.gender}</td>
<td> ${student.address}</td>
<td> ${student.age}</td>
<td> ${student.courses}</td>
<td> ${student.mobileno}</td>
</tr>

</table>
<a href="student">Add New Student</a>
</body>
</html>