<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Cadastro</title>
  <meta name="description" content="CADASTRO">
  <%@ include file="header.jsp" %>
  <link rel="stylesheet" href="resource/css/cadastro.css">
  
</head>

<body background="planoazul.png">
  
  <div class="container">
    
    <div class="row col-md-12">
      <head><h1>Formulário de Cadastro</h1></head>
      <br>
    </div>
    
    <c:if test="${not empty msg }">
    <div class="alert alert-success">${msg}</div>
  </c:if>
  <c:if test="${not empty erro }">
    <div class="alert alert-danger">${erro}</div>
  </c:if>

    
    <form action="cadastro" method="post" class="form-inline">
    
      <div class="form-group input-group col-md-2">
        <label for="nome">Nome:</label><br>
        <input type="text" name="nome" class="form-control" id="nome" placeholder="Nome">
      </div>

      <div class="form-group input-group col-md-2">
        <label for="apelido">Apelido:</label><br>
        <input type="text" name="apelido" class="form-control" id="apelido" placeholder="Apelido">
      </div>
    
       
      <div class="form-group input-group col-md-4">
        <label for="email">Digite seu e-mail:</label>
        <input type="email" name="email" class="form-control" id="email" placeholder="Digite seu e-mail">
      </div>
          
      <div class="form-group input-group col-md-4">
        <label for="pswd1">Digite a senha:</label>
        <input type="text" name="pwd1" class="form-control" id="pwd1" placeholder="Digite a senha">
      </div>
          
      <div class="form-group input-group col-md-4">
        <label for="pswd2">Confirme a senha:</label>
        <input type="password" name="pwd2" class="form-control" id="pwd2" placeholder="Confirme a senha">
      </div>
          
     <!-- <div class="form-group input-group col-md-4">      
        <label for="data">Data de Nascimento: </label>
        <input type="date" name="data" class="form-control" id="data">
      </div>-->
        
         <div class="form-group input-group col-md-2">
          <label for="sexo">Sexo:</label>
          <input list="sexo" name="sexo" id="sex" class="form-control" placeholder="Sexo">
          <datalist id="sexo">
          <option value="M">M</option>
          <option value="F">F</option>
        </datalist>
        </div>

        <div class="form-group input-group col-md-2">
          <label for="altura">Altura:</label>
          <input type="text" name="altura" class="form-control" id="altura" placeholder="Altura">
        </div>
        <br><br>
        

         <!-- <a href="login.html" id="botao" type="submit" class="btn btn-primary"> -->
         <input type="submit" value="Salvar" name="confirmacao" id="botao" class="btn btn-primary">
          <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Continuar
       <!-- </a> -->
        
      </form>

      <p>* TODOS OS CAMPOS SÃO OBRIGATÓRIOS!</p>
      <div id="msgtext"></div>
        
  </div>
  <script src="resource/js/cadastro.js"></script>
  <%@ include file="footer.jsp" %>
</body>
</html>
