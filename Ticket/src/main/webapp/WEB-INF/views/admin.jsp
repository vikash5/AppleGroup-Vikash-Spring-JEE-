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
<h1>ADMIN PAGE</h1>
	${msg}
	<center>Admin Dashboard</center>
   
   <form action="dashboard" method="post"></form>
   
   <form action="insertmovie" method="post">
		<input type="submit" value="insertMovie" />
	</form>
	
	<form action="moviedetails" method="post">
		<input type="submit" value="listofmovie" />
	</form>
   
   <form action="movie" method="post">
		<input type="submit" value="TimingInsert" />
	</form>
   
	<form action="timing" method="post">
		<input type="submit" value="movie Timing" />
	</form>
	
	
	<form action="tickettypecount" method="post">
		<input type="submit" value="RateInsert" />
	</form>
	
	<form action="Ticketrateofclass" method="post">
		<input type="submit" value="type of tickets" />
	</form>
	
	<form action="booked" method="post">
		<input type="submit" value="TicketBooked" />
	</form>

<form action="registrationstatus" method="post">
		<input type="submit" value="Ticketsatus" />
	</form>

<form action="all"/>
<input type="submit" value="MOVE Admin Dashboard"/>
</form>
</body>
</html>