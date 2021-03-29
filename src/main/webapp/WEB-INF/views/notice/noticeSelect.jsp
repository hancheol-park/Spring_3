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
	<h1>noticeSelect</h1>
	
	<h3>Num : ${notice.num}</h3>
	<h1>Title : ${notice.title}</h3>
	<h1>Writer : ${notice.writer}</h3>
	<h3>Contents : ${notice.contents}</h3>
	<h1>Hit : ${notice.hit}</h3>
	<h1>RegDate : ${notice.regdate}</h3>
		
 	<c:if test="${not empty member and member.id eq 'admin'}">
		<a href="./noticeDelete?num=${notice.num}">Delete</a>
		<a href="./noticeUpdate?num=${notice.num}">Update</a>
	</c:if> 
</body>
</html>