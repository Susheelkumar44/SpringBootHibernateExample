<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Confirmation page</h1>


<form action="/confirm">
<div class="row animate-box">
						<div class="col-md-6" >
							<h3 class="section-title"></h3>
							<c:if test="${empty listFlights}">
	<h3>No flights available</h3>
	</c:if>
							<c:if test="${!empty listFlights}">
							<table class="table table-hover" >
							  <thead>
								<tr>
								<th scope="col">Flight Id</th>
								  <th scope="col">Flight Name</th>
								  <th scope="col">Departure</th>
								  <th scope="col">Arrival</th>
								  <th scope="col">Price</th>
								  <th scope="col"></th>
								</tr>
							  </thead>
							  <tbody>
								<c:forEach items="${listFlights}" var="flight">
								<tr>
									<td>${flight.flightid}</td>
									<td>${flight.getFlightName()}</td>
									<td>${flight.departure}</td>
									<td>${flight.arrival}</td>
									<td>${flight.price}</td>
									
									<!--  <td><input type="submit" class="btn btn-primary btn-block" value="Book"></td>
									<!-- <td><a href="<c:url value='/updateCustomer/${customer.id}' />" >Edit</a></td>
									<td><a href="<c:url value='/deleteCustomer/${customer.id}' />" >Delete</a></td> -->
								</tr>
								</c:forEach>
							  </tbody>
							</table>
							</c:if>
						</div>
					</div>
				</form>
				<h3>C</h3>
<c:out value="${msg}"></c:out>
<

</body>
</html>