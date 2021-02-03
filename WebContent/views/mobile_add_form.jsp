<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mobile Form</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style>
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
			<legend> Add Mobile Form </legend>
			<form action="${pageContext.request.contextPath}/add_mobile_action"
				method="POST" modelAttribute="mobile">
				<table>
					<tr><td><input type="text" name="bname" placeholder="BrandName" autocomplete="off" /></td></tr>
					<tr><td><input type="text" name="mname" placeholder="MobileName" autocomplete="off" /></td></tr>
					<tr><td><input type="number" name="price" placeholder="Price" /></td></tr>
					<tr><td><input type="number" name="qty" placeholder="Quantity" /></td></tr>
					<tr>
						<td><input class="btn btn-success" type="submit" value="Submit" />&nbsp;&nbsp;&nbsp;&nbsp;<input class="btn btn-info" type="reset" value="Clear Form" /></td>
						
					</tr>
				</table>  
			</form>
		</fieldset>
	</center>

</body>
</html>