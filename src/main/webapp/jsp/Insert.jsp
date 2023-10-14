<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form action="insert" method="post">
		<fieldset>
			<legend>Insert Data</legend>
			<table>
				<tr>
					<th>Name:</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>Email:</th>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<th>Designation:</th>
					<td><input type="text" name="designation"></td>
				</tr>
				<tr>
					<th>Date of Birth:</th>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<th align="center"><button>Add</button></th>
					<td align="right"><button type="reset">Cancel</button></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><a href="/mvc_crud"><button type="button">Back</button></a></td>
				</tr>
			</table>
		</fieldset>
	</form>
</body>
</html>