<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board}update</h1>
	<form action="./${board}Update" method="post">
		Num <input type="text" name="writer" value="${dto.num}"><br>
		Writer <input type="text" name="writer" value="${dto.writer}"><br>
		Title <input type="text" name="title" value="${dto.title}"><br>
		Contents <input type="text" name="contents" value="${dto.contents}"><br>
		<button>Update</button>
	</form>
</body>
</html>