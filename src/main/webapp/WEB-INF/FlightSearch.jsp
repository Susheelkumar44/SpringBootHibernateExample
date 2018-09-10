<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Flights List</h3>
<c:if test="${empty msg}">
	<h3>No flights available</h3>
	</c:if>
	<c:if test="${!empty msg }">
	<table class="tg">
	<tr>
		<th width="80">Flight Name</th>
		<th width="120">Departure</th>
		<th width="120">Arrival</th>
		<th width="50">Price</th>
		<!-- <th width="60">Edit</th>
		<th width="60">Delete</th> -->
	</tr>
	
	<c:forEach items="${msg}" var="flight">
		<tr>
			<td>${flight.getFlightName()}</td>
			<td>${flight.departure}</td>
			<td>${flight.arrival}</td>
			<td>${flight.price}</td>
			<%-- <td><a href="<c:url value='/updateCustomer/${customer.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteCustomer/${customer.id}' />" >Delete</a></td> --%>
		</tr>
	</c:forEach>
	
	</table></c:if>

</body>
</html>