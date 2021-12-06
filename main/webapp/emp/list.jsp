<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee List</h1>
	<ul>
	<c:if test="${empty list }">
	<h3>no employee yet...</h3>
	
	</c:if>
	<c:forEach items="${list }" var="emp">
		<li><a href="/emp/detail.em?empno=${emp.empno }" >${emp.ename }</a></li>
	</c:forEach>
	
	</ul>
	<h3><a href="/emp/register.em">Register Now</a></h3>
</body>
</html>