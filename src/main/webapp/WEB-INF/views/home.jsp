<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	<c:import url="./template/common_css.jsp"></c:import>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>

<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


	<c:import url="./template/common_js.jsp"></c:import>
</body>
</html>
