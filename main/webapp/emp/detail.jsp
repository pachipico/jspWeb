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
	<ul>
		<li><h3>empno : ${emp.empno }</h3></li>
		<li><h3>name : ${emp.ename }</h3></li>
		<li><h3>job : ${emp.job }</h3></li>
		<li><h3>manager no : ${emp.mgr }</h3></li>
		<li><h3>hire date : ${emp.hireDate }</h3></li>
		<li><h3>salary : ${emp.sal }</h3></li>
		<li><h3>commission : ${emp.comm }</h3></li>
		<li><h3>department no : ${emp.deptno }</h3></li>
	</ul>
	
	<h3><a href="./list.em">List</a></h3>
	<h3><a href="./register.em">Register</a></h3>
	<h3><a href="./modify.em?empno=${emp.empno }">Update</a></h3>
	<h3><a href="./delete.em?empno=${emp.empno }">Delete</a></h3>
</body>
</html>