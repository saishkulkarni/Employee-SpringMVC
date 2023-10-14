<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch</title>
<style type="text/css">
body {
	display: flex;
	align-items: center;
	justify-content: center;
}
</style>
</head>
<body>

	<div>
		<form action="search" method="post">
			<input type="text" name="content">
			<button>Search</button>
		</form>
		<br>
			<h1>${message}</h1>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Designation</th>
				<th>Date of Birth</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="emp" items="${list}">
				<tr>
					<td>${emp.getId()}</td>
					<td>${emp.getName()}</td>
					<td>${emp.getEmail()}</td>
					<td>${emp.getDesignation()}</td>
					<td>${emp.getDob()}</td>
					<td><a href="edit?id=${emp.getId()}"><button>Edit</button></a></td>
					<td><a href="delete?id=${emp.getId()}"><button>Delete</button></a></td>
				</tr>
			</c:forEach>
		</table>
		<br> <a href="/mvc_crud"><button>Back</button></a>
	</div>
</body>
</html>