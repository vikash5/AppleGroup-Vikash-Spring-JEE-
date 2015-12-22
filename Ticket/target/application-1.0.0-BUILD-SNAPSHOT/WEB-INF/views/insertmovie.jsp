<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertmovie1" method="post">
<h2>INSERT MOVIE</h2>
<center>
         
		listofmovies:<input type="text" name="listofmovies" /><br> 
		release<input type="text" name="releasedate" /> <br>
		
		noOfshow<input type="text" name="noOfshow"/><br>
		
		<input type="checkbox" name="count" value="1"/>6.30AM-9.00AM<br>
		<input type="checkbox" name="count" value="2"/>9.00AM-12.00PM<br>
		<input type="checkbox" name="count" value="3"/>12.00PM-3.00PM<br>
		<input type="checkbox" name="count" value="4"/>3.00PM-6.00PM<br>
			TICKET RATE:<input type="submit" value="click"/><br>
			<input type="submit" value="register" /><br></center>
			
	</form>

</body>
</html>