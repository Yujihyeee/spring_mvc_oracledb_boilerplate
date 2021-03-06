<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>

<h2>PublishersList</h2>

<form action="<%= application.getContextPath() %>/publishers/list" method="post">
  <div class="container">
    <label for="pubId"><b>pubId</b></label>
	    <input type="text" placeholder="Enter ID" name="pubId" required>
    <label for="pubName"><b>pubName</b></label>
    	<input type="text" placeholder="Enter name" name="pubName" required>
    <label for="mgrName"><b>mgrName</b></label>
	    <input type="text" placeholder="Enter mgrName" name="mgrName" required>
    <label for="phone"><b>Phone</b></label>
	    <input type="text" placeholder="Enter phone" name="phone" required>
    <button type="submit">view list</button>
  </div>
</form>
</body>
