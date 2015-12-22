<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<h2>list of Movies</h2>


	<div class="row">
		<br>
		<div class="col-sm-12">
			<div class="col-sm-6">
				<br>

				<table border="1" width="123">
					<tr>
						<th>id</th>
						<th>listofmovies</th>
						<th>releasedate</th>
						<th>noOfshow</th>
						<th>createddate</th>
						<th>updateddate</th>

						<th>movie update</th>
					</tr>
					<c:forEach var="variable" items="${admin.datamap}">
						<c:forEach var="variable1" items="${variable.moviemodel}">
							<tr>
								<td><c:out value="${variable1.id}" /></td>
								<td><c:out value="${variable1.listofmovies}" /></td>
								<td><c:out value="${variable1.releasedate}" /></td>
								<td><c:out value="${variable1.noOfshow}" /></td>
								<td><c:out value="${variable1.createddate}" /></td>
								<td><c:out value="${variable1.updateddate}" /></td>

								<td><a href="edit?listofmovies=${variable1.listofmovies}">edit</a></td>
							</tr>
						</c:forEach>
					</c:forEach>

				</table>
			</div>
			<h2>Movies Timing</h2>

			<br>
			<div class="col-sm-6">
				<br>

				<table border="1" width="123">
					<tr>
						<th>id</th>
						<th>timings</th>
						<th>createddate</th>
						<th>updateddate</th>

						<th>time edit</th>
					</tr>
					<c:forEach var="va" items="${admin.datamap}">
						<c:forEach var="variable2" items="${va.movietiming}">
							<tr>
								<td><c:out value="${variable2.id}" /></td>
								<td><c:out value="${variable2.timings}" /></td>
								<td><c:out value="${variable2.createddate}" /></td>
								<td><c:out value="${variable2.updateddate}" /></td>

								<td><a href="edittime?id=${variable2.id}">edit</a></td>
							</tr>
						</c:forEach>
					</c:forEach>

				</table>
			</div>
		</div>
		
	</div>


	<h2>TICKET RATE</h2>
	<div class="row">
		<br>
		<div class="col-sm-12">
			<div class="col-sm-6">
				<br>

				<table border="1" width="123">
					<tr>
						<th>id</th>
						<th>tickettype</th>
						<th>ticketcount</th>
						<th>createddate</th>
						<th>updateddate</th>

						<th>movie update</th>
					</tr>
					<c:forEach var="able" items="${admin.datamap}">
						<c:forEach var="variable3" items="${able.ticketcountmodel}">
							<tr>
								<td><c:out value="${variable3.id}" /></td>
								<td><c:out value="${variable3.tickettype}" /></td>
								<td><c:out value="${variable3.ticketcount}" /></td>
								<td><c:out value="${variable3.createddate}" /></td>
								<td><c:out value="${variable3.updateddate}" /></td>

								<td><a href="editticket?id=${variable3.id}">edit</a></td>
							</tr>
						</c:forEach>
					</c:forEach>

				</table>
			</div>

			<h2>TICKET STATUS</h2>

			<br>
			<div class="col-sm-6">
				<br>

				<table border="1" width="123">
					<tr>
						<th>id</th>
						<th>status</th>
						<th>createddate</th>
						<th>updateddate</th>

						<th>movie update</th>
					</tr>
					<c:forEach var="statu" items="${admin.datamap}">
						<c:forEach var="variable4" items="${statu.reservationmodel}">
							<tr>
								<td><c:out value="${variable4.id}" /></td>
								<td><c:out value="${variable4.status}" /></td>

								<td><c:out value="${variable4.createddate}" /></td>
								<td><c:out value="${variable4.updateddate}" /></td>

								<td><a href="Ticketupdate?id=${variable4.id}">edit</a></td>
							</tr>
						</c:forEach>
					</c:forEach>

				</table>
			</div>

           </div>
		</div>
	

</body>
</html>