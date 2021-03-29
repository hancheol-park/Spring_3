<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="../template/bootStrap.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	
	<h1>noticeList</h1>
	
	<div class="container">	
	
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>No</th>
					<th>제목</th>
					<th>작성자</th>
					<th>내용</th>
					<th>조회수</th>
					<th>작성일</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${list}" var="notice">
					<tr>
						<td><a href="./noticeSelect?num=${notice.num}">${notice.num}</a></td>
						<td>${notice.title}</td>
						<td>${notice.writer}</td>
						<td>${notice.contents}</td>
						<td>${notice.hit}</td>
						<td>${notice.regdate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		 <c:if test="${not empty member and member.id eq 'admin'}">
			<a href="./noticeInsert">Insert</a>
		</c:if> 
	</div>	

</body>
</html>