<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>noticeInsert</h1>
	
	<form action="./noticeInsert" method="post">
		<div class="form-group">
			<label for="title">ID</label> 
			<input type="text" class="form-control"	id="title" name="title">
		</div>
		<div class="form-group">
			<label for="writer">Password</label> 
			<input type="text" class="form-control" id="writer" name="writer">
		</div>
		<div class="form-group">
			<label for="contents">Name</label> 
			<input type="text" class="form-control"	id="contents" name="contents">
		</div>
		<button>Update</button>	
	</form>
</body>
</html>