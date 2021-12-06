<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<c:set value="${pvo }" var="pvo" />
<body>
	<ul>
		<li>${pvo.pno}</li>
		<li>${pvo.pname}</li>
		<li>${pvo.price}</li>
		<li>${pvo.regDate}</li>
	</ul>
	<h3>
		<a href="/product/list.pd"> List</a>
	</h3>
	<h3>
		<a href="/product/modify.pd?pno=${pvo.pno }">수정</a>
	</h3>
	<h3>
		<a href="/product/delete.pd?pno=${pvo.pno}">삭제</a>
	</h3>
	
</body>
</html>