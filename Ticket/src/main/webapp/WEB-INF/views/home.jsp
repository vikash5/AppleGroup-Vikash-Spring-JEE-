<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h2>LOGIN IN </h2>

	<form action="login" method="post">

		username:<input type="text" name="username" /><br></br> 
		password:<input type="password" name="password" /><br></br> 
		<input type="submit"value="login" />
		</form>
		
		<form action="Register" method="post">
         <input type="submit" value="register"/> 
         
        </form>
</body>
</html>
