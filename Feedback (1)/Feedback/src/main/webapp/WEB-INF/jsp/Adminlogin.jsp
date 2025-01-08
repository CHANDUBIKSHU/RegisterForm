
<h1>Well Come To Anonymous Student Feedback System</h1>
<a href="home"><button type="submit">Home</button></a>
<form action="Adminlogin" method="get">
	<label>Admin Id</label> 
		<input type="text" name="adminid" pattern="[A-Z a-z]+" minlength="8" required> 
	<label>Password</label>
		<input type="password" name="password" required>
	<h4>${wrongpass}</h4>
	<button type="submit">Login</button>
</form>
</body>
</html>
