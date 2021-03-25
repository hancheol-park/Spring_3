<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>bankbookselect</h1>
	
	<h3>Name:  ${dto.bookName}</h3>
	<h3>Number: ${dto.bookNumber}</h3>
	
	<c:if test="${not empty member}">
		<c:if test="${member.id eq 'admin'}">
			<a href="./bankbookDelete?bookNumber=${dto.bookNumber}">delete</a>
			<a href="./bankbookUpdate?bookNumber=${dto.bookNumber}">update</a>
		</c:if>
	</c:if>
</body>
</html>