<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="Header.jsp" %>

<!-- Category Form Started -->
<c:if test="${flag}">
<form action=UpdateCategory" method="post">
</c:if>

<form action="AddCategory" method="post">
<table align="center" cellspacing="2">
	<tr>
		<td colspan="2">Category Details</td>
		<c:if test="${flag}">
		<input type="hidden" name="catid" value="${category.catid }"/>
		</c:if>
	</tr>
	<tr>
	
	<td>Category Name</td>
	<c:if test="${flag}">
	<td><input type="text" name="catname" value="${category.catname }"/></td>
		</c:if>
	<c:if test="${!flag}">	
	<td><input type="text" name="catname"/></td>
	</c:if>
	</tr>
	<tr>
	<td>Category Description</td>
	<c:if test="${flag}">
	<td><input type="text" name="catdesc" value="${category.catdesc }"/></td>
	</c:if>
	<c:if test="${!flag}">
	<td><input type="text" name="catdesc"/></td>
	</c:if>
	</tr>
	<tr>
	<td colspan="2">
		<input type="submit" value="AddCategory"/>
	</td>
	</tr>
</table>
</form>
<!-- Category Form Completed -->
<!--------Displaying the category Data using table--------->
<table cellspacing="2" align="center" border="1">
<tr bgcolor="gray">
<td>Category Id</td>
<td> Category Name</td>
<td>Category Desc</td>
<td> Operation</td>
</tr>
<c:forEach items="${catdetail }" var="category">
<tr bgcolor="pink">
<td>${category.catid}</td>
<td>${category.catname }</td>
<td>${category.catdesc }</td>
<td>
<a href="<c:url value="deletecategory/${category.catid} "/>"> Delete</a>
<a href="<c:url value="updatecategory/${category.catid} "/>">Update</a>
</td>
</tr>
</c:forEach>
</table>


</body>
</html>
