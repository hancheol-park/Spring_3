<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>noticeUpdate</h1>
	<form action="./noticeUpdate" method="post">
		Number <input type="hidden" name="num" value="${notice.num}"><br>
		Title <input type="text" name="title" value="${notice.title}"><br>
		Writer <input type="text" name="writer" value="${notice.writer}"><br>
		Contents <input type="text" name="contents" value="${notice.contents}"><br>
		Hit <input type="text" readonly="readonly" name="hit" value="${notice.hit}"><br>
		regDate <input type="text" readonly="readonly" name="regdate" value="${notice.regdate}"><br>
		<button>Update</button>
	</form>
</body>
</html>