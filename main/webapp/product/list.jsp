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
	<h1>Product List Page2</h1>
	<c:if test="${empty list }">
		<h1>아무고토 없어용</h1>
	</c:if>
	<c:forEach items="${list }" var="pvo">
		<a href="/product/detail.pd?pno=${pvo.pno}">${pvo.pname}</a>
		<br>
	</c:forEach>
	<h3>

		<a href="/product/register.pd"> register</a>
	</h3>
</body>
</html>