<html>
<body>

	<script type="text/javascript">
		function validatePasswords() {
			var t1 = parseInt(document.getElementById("password").value);
			var t2 = parseInt(document.getElementById("cpassword").value);
			if(t1 != t2){
				alert("Entered Password and Confirm Password is mismatch.");
			}
		}
</script>
	<jsp:include page="Header.jsp" />
	<p align="center">Welcome to the Voter page</p>
	<jsp:include page="register-header.html" />

	<form action="registerCandidate" method="get">
		<div class="container">
			<h1>Register</h1>
			<p>Please fill the details for sign in.</p>
			<hr>

			<label for="name"><b>First Name</b></label> <input type="text"
				placeholder="First Name" name="firstName" id="firstname" required>

			<label for="name"><b>Last Name</b></label> <input type="text"
				placeholder="Last Name" name="lastName" id="lastname" required>

			<label for="name"><b>Father Name</b></label> <input type="text"
				placeholder="Father Name" name="fatherName" id="fathername" required>

			<label for="name"><b>Mother Name</b></label> <input type="text"
				placeholder="Mother Name" name="motherName" id="mothername" required>

			<label for="name"><b>Date Of Birth</b></label> <input type="date"
				name="dob" id="dob" required><br />
			<br /> <label for="gender"><b>Please select your gender:</b></label>
			<input type="radio" id="male" name="gender" value="1" required>Male
			<input type="radio" id="female" name="gender" value="2" required>Female
			<input type="radio" id="other" name="gender" value="3" required>Other

			<br />
			<br /> <label for="addhar"><b>Addhaar Number</b></label> <input
				type="text" placeholder="Addhaar Number" name="addhaar" id="addhaar"
				required> <label for="email"><b>Email</b></label> <input
				type="text" placeholder="Enter Email" name="email" id="email"
				required> <label for="psw"><b>Password</b></label> <input
				type="password" placeholder="Enter Password" name="psw" id="password"
				required> <label for="psw"><b>Confirm Password</b></label> <input
				type="password" placeholder="Renter Password" name="cpsw" id="cpassword"
				required>
				
				<input type="hidden" name="hide_value" id="hide_value" value="1" />

			<p>
				By creating an account you agree to our <a href="#">Terms &
					Privacy</a>.
			</p>

			<button type="submit" class="registerbtn"
				onclick="validatePasswords()">Register</button>
		</div>

		<div class="container signin"></div>
	</form>

</body>
</html>