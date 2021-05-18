<html>
<body>
<jsp:include page="Header.jsp" />
<p align="center"> Welcome to the Voter page</p>
<jsp:include page="register-header.html" />

<form action="#">
  <div class="container">
    <h1>Login</h1>
    <p>Please enter the Email and Password.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <button type="submit" class="registerbtn">Login</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="voter-signin.jsp">Sign in</a>.</p>
  </div>
</form>

</body>
</html>