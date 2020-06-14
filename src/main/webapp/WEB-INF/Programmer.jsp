
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Programmer's COVID-19 Interactive Session</title>
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
		      <li class="nav-item">
		        <a class="nav-link" href="#" onClick="getQuizPage()">Can You Stop the Spread - Quiz</a>
		      </li>	      
		    </ul>
		  </div>
		</nav>
		<h1 class="text-center">Programmer Before Quarantine</h1>
		<img src="/images/programmer.jpg" alt="Kawaii Programmer">
		<hr>
		<h1 class="text-center">Programmer After Quarantine</h1>
		<img src="/images/programmer.jpg" usemap="#image-map">
		<map name="image-map">
		    <area target="_self" alt="Beautiful Face" title="Beautiful Face" href="" coords="135,90,224,91,251,135,216,160,151,159,106,135,119,112" shape="poly">
		    <area target="_self" alt="Controller" title="Controller" href="" coords="147,212,211,214,207,223,219,235,221,251,190,251,147,248,166,240,161,223" shape="poly">
		    <area target="_self" alt="Left Foot" title="Left Foot" href="" coords="96,288,99,308,105,322,116,325,129,323,137,308,137,291" shape="poly">
		    <area target="_self" alt="Right Foot" title="Right Foot" href="" coords="219,285,222,320,240,325,252,320,261,307,269,282" shape="poly">
		    <area target="_blank" alt="Console " title="Console " href="" coords="" shape="poly">
		</map>
		
		<h1 class="text-center">Fun Coding Ideas!</h1>
		<ol> 
			<li>Flashcard Maker</li>
			<li>Text Adventure</li>
			<li>Maze Generator</li>
			<li>Virtual Pet Simulator</li>
			<li>Generative Art</li>
			<li>Net Worth Calculator</li>
			<li>A Bill Splitter </li>
			<li>Random Name Generator</li>
			<li>Unbeatable Tic-Tac-Toe Engine</li>
			<li>Chess Engine</li>
			<li>Chatbot</li>
			<li>Spam Filter</li>
			<li>Spoiler Blocker</li>
			<li>Temperature Logger</li>
			<li>Lunch Picker</li>
		</ol>
		<form action="/covid.do" method="get" id="home-trigger"></form> 
		<form action="/quiz.do" method="get" id="quiz-trigger"></form> 
		
		<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
		<script type="text/javascript">
			
			function getHomePage(){
				
				document.getElementById("home-trigger").submit();
				
				
			}
			
			function getQuizPage(){
				
				document.getElementById("quiz-trigger").submit();
				
				
			}
			
		
		</script>
			
	</body>	
</html>