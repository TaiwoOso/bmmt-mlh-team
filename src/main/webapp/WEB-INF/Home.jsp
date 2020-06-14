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
          			<a class="nav-link" href="#" style="color:white" onClick="getProgrammerPage()">Fun Programming Projects</a>
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
	<h1 class="text-center">Welcome to Our Covid-19 Interactive Info Session</h1>
	<hr>
<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display">COVID-19</h1>
    <p class="lead">"We need to learn the lessons that are being shown from this virus," Dr. Michael J. Ryan, WHO Informal Advisory Group.</p>
  </div>
 
</div>
<hr>
<div class="row">
	
	<div class="col-md-4">
		<img src="/images/parkCropped.jpg" usemap="#image-map" class="img-fluid">
		<map name="image-map">
		    <area target="_self" alt="Sun" title="Enjoy the Sunset. Preferably at home." href="" coords="263,44,308,53,294,89,281,142,272,145,260,128,246,90,228,53" shape="poly">
		    <area target="_self" alt="Dog" title="Why is this dog wearing mask?" href="" coords="199,323,188,329,181,349,186,357,199,356,203,369,198,389,208,389,214,373,219,381,217,389,224,391,223,372,244,365,244,376,240,382,248,379,252,369,256,358,266,355,276,354,279,361,283,350,264,353,259,338,253,321,252,331,236,333,220,321" shape="poly" >
		    <area target="_self" alt="Masked Boy 1" title="Make sure you wear a mask!" href="" coords="75,211,88,214,105,214,112,209,116,223,114,229,112,239,125,249,132,256,146,271,140,273,112,252,114,273,130,294,131,314,140,318,121,323,124,297,108,282,85,282,95,308,101,329,85,331,84,305,75,285,66,261,73,246" shape="poly">
		    <area target="_self" alt="No Mask Girl" title="Stay the appropriate distance apart" href="" coords="254,199,241,209,236,227,228,227,237,239,255,239,266,237,267,243,259,247,250,255,236,257,248,261,261,256,256,265,254,270,264,273,271,273,274,289,287,296,287,273,296,267,285,257,305,258,313,247,292,251,276,242,297,232,270,205,268,194" shape="poly">
		    <area target="_self" alt="Net Man" title="Enjoy the wildlife" href="" coords="191,185,164,192,164,209,157,221,168,241,186,240,186,217,208,212,220,218,228,211,223,197,188,211" shape="poly">
		    <area target="_self" alt="Masked Girl 1 (Not on mask)" title="" href="" coords="374,277,362,289,370,317,360,339,368,357,371,378,356,396,380,391,387,365,400,378,399,391,410,381,393,356,392,321,388,289,382,272" shape="poly">
		    <area target="_self" alt="Cave" title="Cave" href="" coords="234,93,211,134,260,130" shape="poly">
		    <area target="_self" alt="Workout Guy" title="Enjoy some yoga in nature" href="" coords="263,141,263,153,234,155,231,162,248,161,245,169,250,172,260,163,268,175,294,153,273,150" shape="poly">
		    <area target="_self" alt="Masked Girl 1 (Mask)" title="Have a walk for your mental health" href="" coords="374,273,356,292,342,283,351,241,365,233,390,237,395,257,404,285,392,286" shape="poly">
		    <area target="_self" alt="Masked Man (Mask)" title="Go out for to the park safely for some fresh air for once! I know you don't you're a programmer." href="" coords="418,200,395,174,413,151,440,173" shape="poly" >
		</map>
	</div>
	
	<div class="col-md-8">
		<p class="text-left" id="prompt">

			Hover on people or objects in the image for suggestions and precautions for outdoor activities
		
		</p>
	</div>	
</div>

	<form action="/quiz.do" method="get" id="quiz-trigger"></form> 
	
	 <form action="/programmer.do" method="get" id="programmer-trigger"></form> 
   
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>


<script type="text/javascript">

	
	function getQuizPage(){
		
		document.getElementById("quiz-trigger").submit();
		
		
	}
	
	function getProgrammerPage(){
		
		
		document.getElementById("programmer-trigger").submit();
		
		
	}
	
	
</script>

</body>
</html>
