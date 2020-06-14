<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz Page</title>

<link rel="shortcut icon" href="#">

<link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet"> 
</head>
<body>

<nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
	<a class="navbar-brand" href="#">Team BMMT</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		   <span class="navbar-toggler-icon"></span>
		 </button>
		  <div class="collapse navbar-collapse" id="navbarNav">
		    <ul class="navbar-nav">
		      <li class="nav-item">
		        <a class="nav-link" href="#" onClick="getHomePage()">Home<span class="sr-only">(current)</span></a>
		      </li>	      
		      <li class="nav-item active">
		        <a class="nav-link" href="#" onclick="getProgrammerPage()">Fun Programming Projects</a>
		     </li>      
		</ul>
	</div>
</nav>

<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">How Well Can You Stop the Spread?</h1>
  </div>
</div>



<div class="container">

	<h1>${question}</h1>

	<br>
	
	<form action="/quizAnswerCheck.do" method="get">
		<div class="form-check">
			<c:forEach items="${choices}" var="choice">
				<input class="form-check-input" type="radio" name="userchoice" value="${choice}" checked>
				  <label class="form-check-label" for="${choice}">
				    ${choice}
				  </label>
				  
				  <br>
			</c:forEach>
		</div>
			
		<hr>
			
		<button type="submit" class="btn btn-success">Submit</button>
	
	</form>

<form action="/covid.do" id="home-trigger"></form>
<form action="/programmer.do" id="programmer-trigger"></form>

</div>

	<script type="text/javascript">
			
		function getHomePage(){
				
			document.getElementById("home-trigger").submit();
				
				
		}
			
		function getProgrammerPage(){
				
			document.getElementById("programmer-trigger").submit();
				
				
		}
			
		
	</script>


<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>