<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>상세</h2>

<form action="<%= application.getContextPath() %>/photo/detail" method="post">
  <div class="container">
  	<label for="photoId"><b>photoId</b></label>
	    <input type="text" placeholder="Enter ID" name="photoId" required>
    <button type="submit">submit</button>
  </div>
</form>
</body>