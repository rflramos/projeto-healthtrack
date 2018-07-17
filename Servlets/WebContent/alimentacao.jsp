<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Alimentação</title>
  <meta name="description" content="CADASTRO">
  <%@ include file="header.jsp" %>
  <link rel="stylesheet" href="resource/css/cadastro.css">
  
</head>

<body background="image/planoazul.png"><!--inserido caminho da imagem-->
  
  <div class="container">
  
   <nav class="navbar navbar-inverse"> <!--alterado parametro "navbar-expand-lg navbar-dark bg-dark"-->
    <div class="container-fluid"><!--inserido esta div-->
      <div class="navbar-header"><!--inserido esta div-->
        <a class="navbar-brand" href="#">Healt Track</a><!--alterado de "FiapStore" "Health Track"-->
      </div><!--fechado a div-->
        
        <!--<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>-->

      <!--<div class="collapse navbar-collapse" id="navbarSupportedContent">-->
      <ul class="nav navbar-nav"> <!--alterado parametro "mr-auto"-->
        <li class="active"> <!--alterado parametro "nav-item"-->
          <a class="nav-link" href="cadastro.jsp">Cadastro</a>
        </li>
        <li> <!--class="nav-item"-->
        <a class="nav-link" href="alimentacao?acao=listar">Alimentação</a>
      </li>
    </ul>
  </div>
</nav>
    
    <div class="row col-md-12">
      <head><h1>Alimentação</h1></head>
      <br>
    
    
    
      <c:if test="${not empty msg }">
        <div class="alert alert-success">${msg}</div>
      </c:if>


    <c:if test="${not empty erro }">
      <div class="alert alert-danger">${erro}</div>
    </c:if>
    </div>

    
    <form action="alimentacao" method="post" class="form-inline">
    	<input type="hidden" value="cadastrar" name="acao">
      <div class="form-group input-group col-md-2">
        <label for="alimento">Alimento:</label><br>
        <input type="text" name="alimento" class="form-control" id="alimento" placeholder="Alimento">
      </div>
      
      <div class="form-group input-group col-md-4">      
        <label for="data">Data de Registro </label>
        <input type="date" name="data" class="form-control" id="data">
      </div>

      <div class="form-group input-group col-md-2">
        <label for="calorias">Calorias:</label><br>
        <input type="text" name="calorias" class="form-control" id="calorias" placeholder="Calorias">
      </div>
    
    	<br>
    	<br>
       
       <!-- <a href="login.html" id="botao" type="submit" class="btn btn-primary"> -->
         <input type="submit" value="Salvar" name="confirmacao" id="botao" class="btn btn-primary">
         <!-- <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Continuar -->
       <!-- </a> -->
        
      </form>

  

        
  </div>
  <script src="resource/js/cadastro.js"></script>
  <%@ include file="footer.jsp" %>
</body>
</html>
