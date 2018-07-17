<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
  <title>Dashboard</title>
	<meta name="description" content="DASHBOARD">
	<%@ include file="header.jsp" %>
	<link rel="stylesheet" href="resources/css/dashboard.css">

</head>

<body background="image/coracao.png">
  
  <div class="container-fluid">
  	<nav class="navbar navbar-inverse">
  		<div class="navbar-header">
        	<p class="navbar-brand">HEALTH TRACK - Cuide da sua Saúde!</p>
   			<%@ include file="menu.jsp"  %>
    	</div>
    </nav>
    		
    		
    		<div id="borda" class="row col-md-3">
    			<h1>DASHBOARD</h1>
    			<div class="row col-md-10" id="caixas">
    				<div class="caixa" id="nome">
    					<p>NOME</p>
    					<p>Rafael Ramos</p>
    				</div>
    				<div class="caixa" id="idade">
    					<p>IDADE</p>
    					<p>34</p>
    				</div>
    				<div class="caixa" id="imc">
    					<p>IMC</p>
    					<p>24,4</p>
    					<p>NORMAL</p>
    				</div>
    				<div class="caixa" id="peso">
    					<p>PESO</p>
    					<p>73</p>
    				</div>
    				<div class="caixa" id="calorias">
    					<p>CALORIAS</p>
    					<p>600</p>
    				</div>
    				<div class="caixa" id="pressao">
    					<p>PRESSÃO</p>
    					<p>120/80</p>
    					<p>NORMAL</p>
    				</div>
    			</div>
    		</div>

    		<div id="myCarousel" class="row col-md-5 carousel slide" data-ride="carousel">

    			<ol class="carousel-indicators">
      				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
     			 	<li data-target="#myCarousel" data-slide-to="1"></li>
     			 	<li data-target="#myCarousel" data-slide-to="2"></li>
   			 	</ol>

    
    <div class="carousel-inner">

      <div class="item active">
        <img src="resources/carousel/corrida.png" alt="Faça Exercicios">
        <div class="carousel-caption">
          <H2>Faça Exercicios</H2>
        </div>
      </div>

      <div class="item">
        <img src="resources/carousel/praia.png" alt="Curta a Vida!">
        <div class="carousel-caption">
          <H2>Curta a Vida!</H2>
         </div>
      </div>
    
      <div class="item">
        <img src="resources/carousel/forte.png" alt="Seja Forte">
        <div class="carousel-caption">
          <H2>Seja Forte!</H2>
        </div>
      </div>
  
    </div>

    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</div>

  	<%@ include file="footer.jsp" %>
</body>
</html>
