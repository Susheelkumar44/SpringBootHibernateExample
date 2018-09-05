<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="/images/paris3.jpg">
<f:view>
<h3>Flight List</h3>
<c:if test="${!empty listOfFlights}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Flight Name</th>
		<th width="120">Source</th>
		<th width="50">Destination</th>
		<th width="60">Arrival</th>
		<th width="60">Departure</th>
		<th width="60">Date</th>
		<th width="60">Price</th>
	</tr>
	<c:forEach items="${listOfFlights}" var="flights">
		<tr>
			<td>${flights.flightid}</td>
			<td>${flights.flightName}</td>
			<td>${flights.source}</td>
			<td>${flights.destination}</td>
			<td>${flights.arrival}</td>
			<td>${flights.departure}</td>
			<td>${flights.departdate}</td>
			<td>${flights.price}</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</f:view>
</body>
</html>