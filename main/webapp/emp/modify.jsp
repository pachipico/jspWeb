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
	<h1>update</h1>
<form action="./update.em" >
		<label for="empno">empno</label>
		<input type="number" name="empno" value="${emp.empno }">
		<br>
		<br>
		<label for="ename">name</label>
		<input type="text" name="ename" value="${emp.ename }">
		<br>
		<br>
		<label for="job">job</label>
		<input type="text" name="job" value="${emp.job }">
		<br>
		<br>
		<label for="mgr">manager no.</label>
		<input type="number" name="mgr" value="${emp.mgr }">
		<br>
		<br>
		<label for="sal">salary</label>
		<input type="number" name="sal" value="${emp.sal }">
		<br>
		<br>
		<label for="comm">commission</label>
		<input type="number" name="comm"  value="${emp.comm }">
		<br>
		<br>
		<label for="deptno">department no.</label>
		<input type="number" name="deptno" value="${emp.deptno }"> 
		<button type="submit">Update!</button>
	</form>
</body>
</html>