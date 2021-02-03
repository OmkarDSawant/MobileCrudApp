<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body class="container-fluid">
	<jsp:include page="header.jsp" />
	<center>
		<table class="table table-striped">
			<thead>
				<th>Sr.No.</th>
				<th>Brand</th>
				<th>Mobile</th>
				<th>Price</th>
				<th>Qty</th>
				<th>Action</th>
			</thead>
			<c:forEach var="md" items="${mobile_list}">
				<tr>
					<td>${md.id}</td>
					<td>${md.bname}</td>
					<td>${md.mname}</td>
					<td>${md.price}</td>
					<td>${md.qty}</td>
					<td><a class="btn btn-secondary" href="edit?id=${md.id}">Edit</a> | <a class="btn btn-danger"
						href="delete?id=${md.id}" onclick="javascript: return confirm('Are you sure you want to delete this record?');">Delete</a></td>
				</tr>
				<tr>
					<td>
						<div class="progress">
  						<div class="progress-bar bg-info" role="progressbar" style="width: ${md.qty}%" aria-valuenow="${md.qty}" aria-valuemin="0" aria-valuemax="100"></div>
						</div>
					</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>