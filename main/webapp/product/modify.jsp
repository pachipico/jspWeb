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
	<h1>Update Product</h1>
	<form action="./update.pd" method="post">
		<input type="hidden" name="pno" value="${pvo.pno }">
		Name: <input type="text" name="pname" value="${pvo.pname }"><br>
		Price: <input type="text" name="price" value="${pvo.price }"><br>
		Made By: <input type="text" name="madeBy" value="${pvo.madeBy }"><br>
		<button type="submit">Update</button>
	</form>
	<h3>
		<a href="/product/list.pd"> List</a>
	</h3>
</body>
</html>