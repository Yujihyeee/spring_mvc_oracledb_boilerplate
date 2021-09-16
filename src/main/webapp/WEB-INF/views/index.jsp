<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Spring MVC</h1>
<ol>
	<li><a href="${ctx}/move/books/Detail">Book Detail</a></li>
	<li><a href="${ctx}/move/books/List">Book List</a></li>
	<li><a href="${ctx}/move/books/Register">Book Register</a></li>
	<li><a href="${ctx}/move/books/Update">Book Update</a></li>
</ol>
<ol>
	<li><a href="${ctx}/move/customers/Detail">Customer Detail</a></li>
	<li><a href="${ctx}/move/customers/Join">Customer Join</a></li>
	<li><a href="${ctx}/move/customers/Login">Customer Login</a></li>
	<li><a href="${ctx}/move/customers/Register">Customer Register</a></li>
	<li><a href="${ctx}/move/customers/Update">Customer Update</a></li>
</ol>
<ol>
	<li><a href="${ctx}/move/orders/Detail">Order Detail</a></li>
	<li><a href="${ctx}/move/orders/List">Order List</a></li>
	<li><a href="${ctx}/move/orders/Register">Order Register</a></li>
	<li><a href="${ctx}/move/orders/Update">Order Update</a></li>
</ol>
<ol>
	<li><a href="${ctx}/move/publishers/Detail">Publisher Detail</a></li>
	<li><a href="${ctx}/move/publishers/List">Publisher List</a></li>
	<li><a href="${ctx}/move/publishers/Register">Publisher Register</a></li>
	<li><a href="${ctx}/move/publishers/Update">Publisher Update</a></li>
</ol>
<ol>
	<li><a href="${ctx}/move/photo/Detail">Photo Detail</a></li>
</ol>
</body>
</html>