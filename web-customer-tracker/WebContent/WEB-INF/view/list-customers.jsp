<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>

	<div id="wrapper">

		<div id="header">
			<h2>CRM - Customer Relationship Management</h2>
		</div>

	</div>

	<div id="container">
		<div id="content">

			<!-- Put the new Button to add customer -->

			<input type="button" value="Add Customer"
				onClick="window.location.href='showFormForAdd'; return false;"
				class="add-button" />


			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<a:forEach var="tempCustomer" items="${customers}">

					<a:url var="UpdateLink" value="/customer/showFormForUpdate">
						<a:param name="customerId" value="${tempCustomer.id}" />
					</a:url>

					<a:url var="DeleteLink" value="/customer/delete">
						<a:param name="customerId" value="${tempCustomer.id}" />
					</a:url>	
					<tr>
						<td>${tempCustomer.firstName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.email}</td>
						<td><a href="${UpdateLink}">Update</a>
						    |
						    <a href="${DeleteLink}"
						    onclick="if (!(confirm('Are You sure you want to delete the customer?'))) return false">Delete</a></td>
					</tr>
				</a:forEach>

			</table>

		</div>
	</div>

</body>
</html>