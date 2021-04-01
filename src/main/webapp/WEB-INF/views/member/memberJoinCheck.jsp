<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<c:import url="../template/bootStrap.jsp"></c:import>

<link rel="stylesheet" href="./resources/css/test.css">
<title>Home</title>
</head>
<body>
	
	<c:import url="../template/header.jsp"></c:import>
	
	<div class="container">
		<label class="form-check-label">
			<input type="checkbox" value="1" id="ALL" onclick="check()">전체 동의
		</label>
	</div>
	<div class="container">
		<label class="form-check-label">
			<input type="checkbox" class="form-check-input" value="1" >동의
		</label>
	</div>
	
	<div class="jumbotron">
	  <h1>Bootstrap Tutorial</h1>
	  <p>Bootstrap is the most popular HTML, CSS...</p>
	</div>
	
	<div class="container">
		<label class="form-check-label">
			<input type="checkbox" class="form-check-input" value="1">동의
		</label>
	</div>
	
	<div class="jumbotron">
	  <h1>Bootstrap Tutorial</h1>
	  <p>Bootstrap is the most popular HTML, CSS...</p>
	</div>
	
	<div class="container">
		<label class="form-check-label">
			<input type="checkbox" class="form-check-input" value="1">동의
		</label>
	</div>
	
	<div class="jumbotron">
	  <h1>Bootstrap Tutorial</h1>
	  <p>Bootstrap is the most popular HTML, CSS...</p>
	</div>
	
	<button><a href="./memberJoin">join</button>
<script type="text/javascript" src="../resources/js/memberJoinCheck.js"></script>
	
</body>
</html>