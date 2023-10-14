<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
body {
	display: flex;
	align-items: center;
	justify-content: center;
}
</style>
</head>
<body>
	<div>
		<h3>${message}</h3>
		<a href="insert"><button>Insert Record</button></a> <a href="fetch"><button>Fetch
				Record</button></a>
	</div>
</body>
</html>