<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Answer is...</title>

<link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet"> 
</head>
<body>

	<div class="container">
	
		<br>
		
		<h1 class="h1">${result}</h1>
		
		<hr>
		
		<p class="text-centered">${feedback}</p>
		
		<p class="text-centered">${back-prompt}</p>
		
		
		<form action="${action}" method="get">
		
			<input type="submit" class="btn btn-primary" value="continue">
	
		</form>
	
	</div>
	
	
	<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>