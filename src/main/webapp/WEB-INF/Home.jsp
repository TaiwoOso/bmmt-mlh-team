<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
      <title>Covid-19 Interactive Session</title>
      
      <link href="webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet"> 
  </head>
<body>

 <div class="pos-f-t">
        <div class="collapse" id="navbarToggleExternalContent">
          <div class="bg-dark p-4">
           	<ul class="nav-bar nav">
          		<li class="nav-item">
          			<a class="nav-link" href="#" style="color:white">Home</a>
          		</li>
          		<li class="nav-item">
          			<a class="nav-link" href="#" style="color:white">Fun Programming Projects</a>
          		</li>
          		       		
	          	<li class="nav-item">
	          		<a class="nav-link" href="#" style="color:white" onClick="getQuizPage()">Can You Stop the Spread - Quiz</a>
	          	</li>
          	</ul>
          </div>
        </div>
        <nav class="navbar navbar-dark bg-dark">
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
  		</nav>
  		 
   </div>
<div class="container">
	 <h1>Welcome to Our Covid-19 Interactive Info Session</h1>
	 <img src="City-Park.png">
	 <img src="drawmap.jpg">
	 
</div>
	 
	<form action="/quiz.do" method="get" id="quiz-trigger"></form> 
	 
   
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>


<script type="text/javascript">
	
	function getQuizPage(){
		
		document.getElementById("quiz-trigger").submit();
		
		
	}

</script>

</body>
</html>
