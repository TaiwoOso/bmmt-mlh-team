<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz Page</title>

<link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet"> 
</head>
<body>

<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">How Well Can You Stop the Spread?</h1>
  </div>
</div>

<div class="container">
	
	<p class="text-centered lead"></p>

</div>

<div class="container">

	<form action="/quiz.do" method="post">
		
		
		
		<hr>
			
		<button type="submit" class="btn btn-success">Submit</button>
	
	</form>
	

</div>


<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>