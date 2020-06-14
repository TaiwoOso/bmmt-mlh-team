<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Can you Stop the Spread - Quiz</title>

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
		        <a class="nav-link" href="#" onClick="getProgrammerPage()">Fun Programming Projects</a>
		     </li>      
		</ul>
	</div>
</nav>

<div class="jumbotron">
  <h1 class="display-4">Can You Stop The Spread - Quiz</h1>
  <p class="lead"></p>
  <hr class="my-4">
  <p>See how much you know about social distancing guidelines</p>
  
  <form action="/quiz.do">
	<button class="btn btn-primary btn-lg" type="submit">Start</button>
  	
  </form>
</div>

<form action="/covid.do" id="home-trigger"></form>
<form action="/programmer.do" id="programmer-trigger"></form>

<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	<script type="text/javascript">
			
		function getHomePage(){
				
			document.getElementById("home-trigger").submit();
				
				
		}
			
		function getProgrammerPage(){
				
			document.getElementById("programmer-trigger").submit();
				
				
		}
			
		
	</script>

</body>
</html>