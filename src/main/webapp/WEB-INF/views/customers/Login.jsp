<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>Login Form</h2>

<form action="<%= application.getContextPath() %>/customers/login" method="post">
  <div class="container">
    <label for="custName"><b>custName</b></label>
	    <input type="text" placeholder="Enter custName" name="custName" required>
    <label for="custPhone"><b>custPhone</b></label>
    	<input type="password" placeholder="Enter custPhone" name="custPhone" required>
    <button type="submit">Login</button>
  </div>
</form>
</body>