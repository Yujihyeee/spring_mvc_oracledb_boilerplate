<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 목록</h2>

<form action="<%= application.getContextPath() %>/books/list" method="post">
  <div class="container">
    <label for="pubId"><b>pubId</b></label>
    	<input type="text" placeholder="Enter pubId" name="pubId" required>
    <button type="submit">목록 보기</button>
  </div>
</form>
</body>