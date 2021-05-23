<html>
<body>
<jsp:include page="Header.jsp" />
<jsp:include page="register-header.html" />
<% int a = 1; //0 stands for voting line is closed%> 

	<form action="#">
		<div class="container">
			<p align="center" style="color: green">${param.success}</p>
			<% if(a == 0){ %>
			<p style="color:red">Voting Line is closed.</p>
			<button type="submit" class="registerbtn" disabled>Vote</button>
			<% } else { %>
			<p style="color:blue" id="infoVotingLine">Please Click on Vote for Voting.</p>
			<button type="submit" class="registerbtn">Vote</button>
			<% } %>
		</div>
	</form>


</body>
</html>