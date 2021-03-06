<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>

<form:form action="InsertSupplier" modelAttribute="supplier">
<table align="center">
			<tr>
				<td colspan="2"><center>Supplier Details</center></td>
			</tr>
			<tr>
				<td>Supplier ID</td>
				<td><form:input path="supid" /></td>
			</tr>
			<tr>
				<td>Supplier Name</td>
				<td><form:input path="supname" /></td>
			</tr>
			
					
			<tr>
				<td>Supplier address</td>
				<td><form:input path="supaddrs" /></td>
			</tr>
			
			<tr>
			<td colspan="2"><input type="submit" /></td>
			</tr>
</table>
</form:form>

<!-- Displaying the Product data using Table -->
<table cellspacing="2" align="center" border="1">

	<tr bgcolor="pink">
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Supplier Address</td>
		</tr>
	<c:forEach items="${suplist}" var="supplier">
		<tr bgcolor="cyan">
			<td>${supplier.supid}</td>
			<td>${supplier.supname}</td>
			<td>${supplier.supaddrs}</td>
			<td><a href="<c:url value="deleteSupplier/${supplier.supid}"/>">Delete</a>
				<a href="<c:url value="updateSupplier/${supplier.supid}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>
<!-- Completed Displaying Table -->

</body>
</html>

