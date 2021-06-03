<%@page import = "DAOLayer.*,Controller.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

	<link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<% 	
	int voterId = 1; 
	
%>
<body>
<jsp:include page="Header.jsp" />
	<div id="wrapper">
		<div id="header">
			<h2 align="center">Let's Do Vote!!</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<table>

				<tr>
					<th>Sign</th>
					<th>Action</th>
				</tr>
				<c:forEach var="listSign" items="${sign_list}">

					<c:url var="tempLink" value="VoteEventServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="signId" value="${listSign.id}" />

					</c:url>

				<tr>
					<td> ${listSign.name} </td>
					<td><a href="${tempLink}">Vote</a></td>
				</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>
	<p align = "center" style="color:red" id="demo"></p>
<script type="text/javascript">
function confirmVote(){
	var c = confirm('Are u sure');
	if(c == true){
		document.getElementById("demo").innerHTML = "You pressed OK!";
	}else{
		document.getElementById("demo").innerHTML = "You pressed Cancel!";
	}
}
</script>
</body>
</html>