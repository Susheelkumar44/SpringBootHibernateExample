<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #db581c;
    color: white;
}
</style>
</head>
<body>
<form action="/confirm">
<f:view>
<h3>Flight List</h3>
<c:if test="${!empty listFlights}">
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
	<c:forEach items="${listFlights}" var="flights">
	
		<tr>
			<td>${flights.flightid}</td>
			<td>${flights.flightName}</td>
			<td>${flights.source}</td>
			<td>${flights.destination}</td>
			<td>${flights.arrival}</td>
			<td>${flights.departure}</td>
			<td>${flights.departdate}</td>
			<td>&#8377; ${flights.price}</td>
			
		</tr>
		<c:set  var="cost" scope="session" value="${flights.price}"/>
		
		<input type="hidden" id="user" name="cost" value="${cost}"/>
	 	
		<%-- <%double cost=pageContext.getAttribute("cost");
		<%=pageContext.getAttribute("cost") %> %> --%>
		
		
	</c:forEach>
	</table>
	
	


	
</c:if>
</f:view>

<!-- 
<select id="pc">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
</select>-->



<h3>Passenger Count:</h3>
<input type="text" list="pcs" name="pc">
  <datalist id="pcs">
    <option value="1">
    <option value="2">
    <option value="3">
    <option value="4">
    <option value="5">
  </datalist>
  <br/>
  <h3>Travel Class:</h3>
  
  <input type="text" list="tc" name="travelClass">
  <datalist id="tc">
    <option value="Economy">
    <option value="Premium Economy">
    <option value="Business">
  </datalist>

   <!--  <a href="/confirm">Continue</a>
   -->
   <input type="submit" onclick="location.href='/confirm';" />
  
  </form>
</body>
</html>
