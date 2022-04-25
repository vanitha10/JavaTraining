<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page </title>
</head>
<body>
<form action =LoginServlet method=post>


<table style="background-color:skyblue">

<tr>   <td>

<h3>Login Page!!!</h3>

</td></tr>


<tr><td>Enter Username:</td><td><input type="text" name="username"></td></tr>
<tr><td>Enter Password</td><td><input type="password" name="password"></td></tr>




<tr><td> <input type="submit" name="submit" value="login"></td><td></td></tr>

<tr><td><input type=reset></td></tr>


</table>

</form>
</body>
</html>