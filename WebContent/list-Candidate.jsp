<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

	<link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<body>
<jsp:include page="Header.jsp" />


<!-- <input type="button" value="Add Candidate" 
				   onclick="window.location.href='candidate-signin.jsp'; return false;"
				   class="add-student-button"
			/> -->
<hr>
<form action="AdminService" method = "post">
  	<div class="container">
		<button type="submit" class="registerbtn">CandidateList</button>
	</div>
</form>
<hr>
	
	<div id="wrapper">
		<div id="header">
			<h2 align = "center">Candidate List</h2>
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
				</tr>
				<c:forEach var="tempStudent" items="${Candidate_List}">
				
				<%-- <c:url var="tempLink" value="AdminService">
						<c:param name="command" value="LOAD" />
						<c:param name="studentId" value="${tempStudent.id}" />
				</c:url> --%>
					<tr>
						<td>${tempStudent.id}</td>
						<td>${tempStudent.candidate_firstName}</td>
						<td>${tempStudent.candidate_lastName}</td>
						<td>${tempStudent.candidate_fatherName}</td>
						<td>${tempStudent.candidate_motherName}</td>
						<td>${tempStudent.candidate_DOB}</td>
						<td>${tempStudent.candidate_gender}</td>
						<td>${tempStudent.candidate_userName}</td>
						<%-- <td>${tempStudent.voter_userName}</td> --%>
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