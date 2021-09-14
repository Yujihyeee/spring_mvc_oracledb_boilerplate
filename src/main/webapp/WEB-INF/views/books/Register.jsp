<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 추가</h2>

<form action="<%= application.getContextPath() %>/books" method="post">
  <div class="container">
    <label for="bookId"><b>bookId</b></label>
	    <input type="text" placeholder="Enter ID" name="bookId" required>
    <label for="bookTitle"><b>bookTitle</b></label>
    	<input type="text" placeholder="Enter bookTitle" name="bookTitle" required>
    <label for="price"><b>address</b></label>
    	<input type="text" placeholder="Enter price" name="price" required>
    <label for="pubId"><b>pubId</b></label>
    	<input type="text" placeholder="Enter pubId" name="pubId" required>
    <button type="submit">책 추가</button>
  </div>
</form>
</body>
