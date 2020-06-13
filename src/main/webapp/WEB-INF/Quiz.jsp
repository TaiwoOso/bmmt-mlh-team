<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	
	<p class="text-centered lead">Question goes here</p>

</div>

<div class="container">

	<form action="/quiz.do">
		
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="0" checked>
		  <label class="form-check-label" for="exampleRadios1">
		    Answer 1
		  </label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="0" checked>
		  <label class="form-check-label" for="exampleRadios1">
		    Answer 2
		  </label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="0" checked>
		  <label class="form-check-label" for="exampleRadios1">
		    Answer 3
		  </label>
		</div>
		<div class="form-check">
		  <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="0" checked>
		  <label class="form-check-label" for="exampleRadios1">
		    Answer 4
		  </label>
		</div>
		
		<hr>
			
		<button type="submit" class="btn btn-success">Submit</button>
	
	</form>
	

</div>


<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

</body>
</html>