
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>           
.blue-button{
	 background: rgba(249, 79, 37, 0.0);
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#000;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 50%;
}
th {
 background: rgba(249, 79, 37, 0.5);
  color: black;
}
 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: left;
                padding: 5px 10px;
            }
</style>
</head>
<body background="\images\paris3.jpg">
<form:form method="post" modelAttribute="customer" action="${pageContext.request.contextPath}/addCustomer">
<center> <img src="\images\mmt.png"> </center>
<table align="center">
		<tr>
			<center><th colspan="2">Sign Up</th></center>
		</tr>
		<tr>
	<form:hidden path="id" />
          <td><form:label path="customerName">Name:</form:label></td>
          <td><form:input path="customerName" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
			    <td><form:label path="email">Email:</form:label></td>
          <td><form:input path="email" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
			    <td><form:label path="password">Password:</form:label></td>
          <td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<c:if test="${!empty listOfCustomers}">
<h3 style="text-align:center">You have Successfully registered</h3>
</c:if>
<table class="tg">
</table>
<!--  <h3>Customer List</h3>
<c:if test="${!empty listOfCustomers}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Customer Name</th>
		<th width="120">Email</th>
		<th width="50">Password</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfCustomers}" var="customer">
		<tr>
			<td>${customer.id}</td>
			<td>${customer.customerName}</td>
			<td>${customer.email}</td>
			<td>${customer.password}</td>
			<td><a href="<c:url value='/updateCustomer/${customer.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteCustomer/${customer.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>-->
</body>
</html>
