<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>

The Student is confirmed : ${student.firstName} ${student.lastName }
<br>
The Student belongs to ${student.country}
<br><br>
The Stream selected is ${student.Stream}
</body>
</html>