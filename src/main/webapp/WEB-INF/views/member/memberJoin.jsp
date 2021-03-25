<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>memberJoin</h1>
	<form action="./memberJoin" method="post">
		Id <input type="text" name="id"><br>
		Pw <input type="text" name="pw"><br>
		Name <input type="text" name="name"><br>
		Phone <input type="text" name="phone"><br>
		Email <input type="text" name="email"><br>
		<button>Join</button>
	</form>
</body>
</html>