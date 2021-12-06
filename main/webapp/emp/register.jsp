<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./insert.em" >
		<label for="empno">empno</label>
		<input type="number" name="empno">
		<br>
		<br>
		<label for="ename">name</label>
		<input type="text" name="ename">
		<br>
		<br>
		<label for="job">job</label>
		<input type="text" name="job">
		<br>
		<br>
		<label for="mgr">manager no.</label>
		<input type="number" name="mgr">
		<br>
		<br>
		<label for="sal">salary</label>
		<input type="number" name="sal">
		<br>
		<br>
		<label for="comm">commission</label>
		<input type="number" name="comm">
		<br>
		<br>
		<label for="deptno">department no.</label>
		<input type="number" name="deptno">
		<button type="submit">Register!</button>
	</form>
</body>
</html>