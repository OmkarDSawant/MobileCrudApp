<% 
	String session_username = (String)session.getAttribute("username");
%>
<div>
<nav class="navbar navbar-dark bg-dark">
<div class="container-fluid">
	<% if(session_username != null){ %>
	<div class="col-lg-4">
		<button type="button" class="btn btn-light" onclick="window.location.href = '${pageContext.request.contextPath}/add_mobile';">Add</button>&nbsp;&nbsp;
		<button type="button" class="btn btn-light" onclick="window.location.href = '${pageContext.request.contextPath}/dashboard';">List</button>&nbsp;&nbsp;
		<button type="button" class="btn btn-light" onclick="window.location.href = '${pageContext.request.contextPath}/chart';">Charts</button>&nbsp;&nbsp;
		<% if(session_username.equals("admin")){ %>
		<button type="button" class="btn btn-light" onclick="window.location.href = '${pageContext.request.contextPath}/reguser';">Register</button>		
		<%} %>	
	</div>
	<%} %>
	<div class="col-lg-4"></div>
	<div class="col-lg-4">
		<% if(session_username == null){ %>
		<button type="button" class="btn btn-light" onclick="window.location.href = '${pageContext.request.contextPath}/login';">Login</button>&nbsp;&nbsp;&nbsp;		
		<%} %>
		
		
		<% if(session_username != null){ %>
		<font color="white">Welcome <%= session.getAttribute("username") %> |</font>
		<button type="button" class="btn btn-light" onclick="window.location.href = '${pageContext.request.contextPath}/logout';">Logout</button>
		<%} %>
	</div>
</div>
</nav>
</div>  


<br>