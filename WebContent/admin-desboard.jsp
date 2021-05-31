<%@page import="DAOLayer.IsVoting_DAO,Controller.*"%>

<html>
<head>

	<link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<body>
<jsp:include page="Header.jsp" />
<p align="center"> Welcome to the AdminDesboard page</p>

<jsp:include page="register-header.html" />
<div class="container">
<hr>
    <p>To Get the List of Candidate <a href="list-Candidate.jsp">Click Here</a>.</p>
    
<hr>
    <p>To Get the List of Voter <a href="list-Voters.jsp">Click Here</a>.</p>
    
<hr>
<% 
	IsVoting isVoting = IsVoting_DAO.getIsVoting();
%>


		<form action="IsVotingServlet" method="get">
			<div class="container">
			
				To Start the Voting <input type="checkbox" id="myCheck" name ="my" 
				<%=isVoting.getIsActive() == 1 ? "checked" : "" %>><br>
			
				<br>
				<button type="submit" class="add-student-button">SAVE</button>
				 
			</div>
		</form>
		<hr>
	</div>
</body>
</html>