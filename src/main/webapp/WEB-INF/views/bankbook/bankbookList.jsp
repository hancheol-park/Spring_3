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
	<h1>bankbookList</h1>
	
	<table>
		<thead>
			<tr>
				<td>name</td>
				<td>rate</td>
				<td>sale</td>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${list}" var="list">
			<tr>
				<td><a href="./bankbookSelect?bookNumber=${list.bookNumber}">${list.bookName}</td>
				<td>${list.bookRate}</td>
				<td>${list.bookSale}</td>
			</tr>
		</c:forEach>
		</tbody>
		
	</table>
</body>
</html>