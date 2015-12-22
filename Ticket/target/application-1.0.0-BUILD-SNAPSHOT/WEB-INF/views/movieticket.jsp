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
<h2> TICKET TYPE & RATE</h2>
<form action="ratecount" method="post">
Ticket Type:<input type="text" name="tickettype"/>

Ticket RATE:<input type="text" name="ticketcount"/>

<input type="submit" value="click"/>
</form>
</body>
</html>