<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body style="background-image:url(${pageContext.request.contextPath}/images/trial.jpg)">
	<jsp:include page="header.jsp"/>
	
	<center>
		<fieldset>
			<legend>
				Login
			</legend>
			<form action="${pageContext.request.contextPath}/login_action" method="POST">
			<input type="text" name="username" placeholder="UserName" autocomplete="off"/><br/><br/>
			<input type="password" name="password" placeholder="Password"/><br/><br/>
			<button type="submit" class="btn btn-success" value="Submit">Login</button>
			</form>
		</fieldset>
	</center>
</body>
</html>