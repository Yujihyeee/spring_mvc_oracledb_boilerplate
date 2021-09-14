<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>주문 상세</h2>

<form action="${contextPath}/orders" method="post">
  <div class="container">
  	<label for="orderId"><b>orderId</b></label>
	    <input type="text" placeholder="Enter ID" name="orderId" required>
    <label for="custId"><b>custId</b></label>
	    <input type="text" placeholder="Enter ID" name="custId" required>
    <label for="bookId"><b>bookId</b></label>
    	<input type="text" placeholder="Enter name" name="bookId" required>
    <label for="orderPrice"><b>orderPrice</b></label>
	    <input type="text" placeholder="Enter orderPrice" name="orderPrice" required>
    <label for="orderDate"><b>custPhone</b></label>
	    <input type="text" placeholder="Enter orderDate" name="orderDate" required>
    <button type="submit">Join</button>
  </div>
</form>
</body>