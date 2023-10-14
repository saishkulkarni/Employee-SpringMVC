<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	display: flex;
	align-items: center;
	justify-content: center;
}
</style>
</head>
<body>
	<form action="update" method="post">
		<input type="text" name="id" value="${emp.getId()}" hidden>
		<fieldset>
			<legend>Edit Data</legend>
			<table>
				<tr>
					<th>Name:</th>
					<td><input type="text" name="name" value="${emp.getName()}"></td>
				</tr>
				<tr>
					<th>Email:</th>
					<td><input type="email" name="email" value="${emp.getEmail()}"></td>
				</tr>
				<tr>
					<th>Designation:</th>
					<td><input type="text" name="designation"
						value="${emp.getDesignation()}"></td>
				</tr>
				<tr>
					<th>Date of Birth:</th>
					<td><input type="date" name="dob" value="${emp.getDob()}"></td>
				</tr>
				<tr>
					<th align="center"><button>Update</button></th>
					<td align="right"><button type="reset">Cancel</button></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><a href="/mvc_crud/fetch"><button
								type="button">Back</button></a></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>