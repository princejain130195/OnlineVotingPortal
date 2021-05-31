<%-- <%@ page import=	"java.util.*, 
					Controller.*" 
%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>


<head>

	<link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<body>

<jsp:include page="Header.jsp" /><br/>

	<div class="container">
		<!-- <input type="button" value="Add Voter"
			onclick="window.location.href='voter-signin.jsp'; return false;"
			class="add-student-button" /> -->
	</div>
	<hr>
	<form action="AdminService" method="get">
		<div class="container">
			<button type="submit" class="add-student-button">VoterList</button>
		</div>
	</form>
	<hr>
	<div id="wrapper">
		<div id="header">
			<h2 align = "center">Voters List</h2>
		</div>
	</div>

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
					<!-- <th>Action</th> -->
				</tr>
				<c:forEach var="tempStudent" items="${Voter_List}">
				
				<%-- <c:url var="tempLink" value="AdminService">
						<c:param name="command" value="LOAD" />
						<c:param name="studentId" value="${tempStudent.voter_id}" />
				</c:url> --%>
					
					<tr>
						<td>${tempStudent.voter_id}</td>
						<td> ${tempStudent.voter_firstName} </td>
						<td> ${tempStudent.voter_lastName} </td>
						<td> ${tempStudent.voter_fatherName} </td>
						<td> ${tempStudent.voter_motherName} </td>
						<td> ${tempStudent.voter_DOB} </td>
						<td> ${tempStudent.voter_gender} </td>
						<td> ${tempStudent.voter_signin_userName} </td>
						<%-- <td> 
							<a href="${tempLink}">Update</a> 
						</td> --%>
					</tr>
				
				</c:forEach>

			</table>

		</div>

	</div>
	<hr>
	<p>To Go Back <a href="admin-desboard.jsp">Click Here</a>.</p>
	<hr>
<jsp:include page="footer.html" />
</body>
</html>