<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Form</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	
<style type="text/css">
table{
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp" />
	<center>
		<fieldset>
			<legend>Add User</legend>
			<form action="${pageContext.request.contextPath}/add_user_action"
				method="POST" modelAttribute="register">
				<input type="email" name="username" placeholder="Username"
					autocomplete="off" /><br />
				<br /> <input type="password" name="password" id="txtPassword"
					placeholder="Password" autocomplete="off" /><br />
				<br /> <input type="password" id="txtConfirmPassword" 
					name="password1" placeholder="Confirm Password" autocomplete="off" /><br />
				<br /> 
				<button type="submit" class="btn btn-success" value="Submit" onclick="return Validate()">Save</button>
				<button type="reset" class="btn btn-info" value="Clear">Clear</button>
			</form>
		</fieldset>
	</center>
	<script type="text/javascript">
		function Validate() {
			var password = document.getElementById("txtPassword").value;
			var confirmPassword = document.getElementById("txtConfirmPassword").value;
			if (password != confirmPassword) {
				alert("Passwords do not match.");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>