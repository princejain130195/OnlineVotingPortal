<html>
<body>
<jsp:include page="Header.jsp" />
<p align="center"> Welcome to the Candidate Page</p>

<a href="regis-candidate.html">
    		SignIn
		</a>


<a href="regis-candidate.html">
    		Login
		</a>
	The Student is confirmed: ${param.firstName} ${param.lastName}  
	
<jsp:include page="register-header.html" />

<form action="#">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <button type="submit" class="registerbtn">Register</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
</form>			
</body>
</html>