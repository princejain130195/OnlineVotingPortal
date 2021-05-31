<%@page import="DAOLayer.IsVoting_DAO,Controller.*"%>
<html>
<body>
<jsp:include page="Header.jsp" />
<jsp:include page="register-header.html" />
<% IsVoting isVoting = IsVoting_DAO.getIsVoting(); //0 stands for voting line is closed%> 

	<form action="VoteEventServlet" method = "get">
		<div class="container">
			<p align="center" style="color: green">${param.success}</p>
			<% if(isVoting.getIsActive() == 0){ %>
			<h1 align = "center" style="color:red">Voting Line is closed.</h1>
			<% } else { %>
			<p style="color:blue" id="infoVotingLine">Please Click on Vote for Voting.</p>
			<button type="submit" class="registerbtn">Vote</button>
			<% } %>
		</div>
	</form>


</body>
</html>