<html>
<body>
<jsp:include page="Header.jsp" />
<p align="center"> Welcome to the admin page</p>

<jsp:include page="register-header.html" />

<form action="AdminLogin" method="get">
  <div class="container">
  	<h2 align="center" style="color:red">${Admin}</h2>
    <h1>Login</h1>
    <p>Please give the credential.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

    <button type="submit" class="registerbtn">Login</button>
  </div>
  
  <div class="container signin">
  </div>
</form>
</body>
</html>