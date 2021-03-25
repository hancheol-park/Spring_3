<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>memberUpdate</h1>
	<form action="./memberUpdate" method="post">
		ID <input type="text" readonly="readonly" name="id" value="${member.id}"><br>
		PW <input type="text" name="pw" value="${member.pw}"><br>
		Name <input type="text" name="name" value="${member.name}"><br>
		Email <input type="text" name="email" value="${member.email}"><br>
		Phone <input type="text" name="phone" value="${member.phone}"><br>
		<button>Update</button>
	</form>
</body>
</html>