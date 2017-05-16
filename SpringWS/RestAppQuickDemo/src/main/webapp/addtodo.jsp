<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>todo form</title>
</head>
<body>
<div align="center">
	<form action="./rest/todos" method="post">
		<table>
		<caption><h1>Todo App</h1></caption>
		<tr>
			<td>Id</td>
			<td><input type="number" name="id"></td>
		</tr>
		<tr>
			<td>Task</td>
			<td><input type="text" name="task"></td>
		</tr>
		<tr>
			
			<td colspan="2" align="right"><input type="submit" value="Add"></td>
		</tr>
		</table>
	</form>
</div>

</body>
</html>