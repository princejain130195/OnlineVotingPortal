<%-- <%@ page import=	"java.util.*, 
					Controller.*" 
%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<%-- <% List<Voter> voters = (List<Voter>) request.getAttribute("Voter_List"); %> --%>
<head>

	<link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<body>
<jsp:include page="Header.jsp" />
<p align="center"> Welcome to the admin page</p>

<form action="AdminService" method = "get">
  	<div class="container">
		<button type="submit" class="registerbtn">Register</button>
	</div>
</form>

	<div id="wrapper">
		<div id="header">
			<h2>Voters List</h2>
		</div>
	</div>
<%-- <% if(voters != null){ %> --%>
	<div id="container">

		<div id="content">

			<table>

				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Father Name</th>
					<th>Mother Name</th>
					<th>DOB</th>
					<th>Gender</th>
					<th>UserName</th>
				</tr>
				<c:forEach var="tempStudent" items="${Voter_List}">
					
					<tr>
						<td>${tempStudent.voter_id}</td>
						<td> ${tempStudent.voter_firstName} </td>
						<td> ${tempStudent.voter_lastName} </td>
						<td> ${tempStudent.voter_fatherName} </td>
						<td> ${tempStudent.voter_motherName} </td>
						<td> ${tempStudent.voter_DOB} </td>
						<td> ${tempStudent.voter_gender} </td>
						<td> ${tempStudent.voter_userName} </td>
					</tr>
				
				</c:forEach>
				<%-- <% for (Voter tempVoters : voters) { %>
				<tr>
					<td><%= tempVoters.getVoter_firstName() %></td>
					<td><%= tempVoters.getVoter_lastName() %></td>
					<td><%= tempVoters.getVoter_fatherName() %></td>
					<td><%= tempVoters.getVoter_motherName() %></td>
					<td><%= tempVoters.getVoter_DOB() %></td>
					<td><%= tempVoters.getVoter_gender() %></td>
					<td><%= tempVoters.getVoter_userName() %></td>
				</tr>

				<% } %> --%>

			</table>

		</div>

	</div>
<%-- 	<%} %> --%>
</body>
</html>