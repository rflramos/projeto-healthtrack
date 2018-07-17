<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
  
  <title>Minha Conta</title>

  <meta name="description" content="MINHA CONTA">
  <%@ include file="header.jsp" %>
  <link rel="stylesheet" href="resources/css/minhaConta.css">
  
</head>

<body  background="image/planoazul.png">
  
  <div class="container-fluid">
    <div class="row col-md-8">
      <head><h1>Dados Cadastrais</h1></head>
      <br>
      
      <form class="form-horizontal">
        <div class="form-group">
          <label class="control-label col-sm-3" for="nome">Nome:</label>
            <div class="col-sm-3">
              <input type="text" class="form-control" id="nome" value="Rafael Ramos" disabled>
            </div>
        </div>

        <div class="form-group">
          <label class="control-label col-sm-3" for="pwd">Apelido:</label>
            <div class="col-sm-3">          
            <input type="text" class="form-control" id="apelido" value="Condorito" disabled>
            </div>
        </div>

        <div class="form-group">
          <label class="control-label col-sm-3" for="email">E-mail:</label>
            <div class="col-sm-3">          
              <input type="text" class="form-control" id="email" value="rflramos@gmail.com" disabled>
            </div>
        </div>

        <div class="form-group">
          <label class="control-label col-sm-3" for="idade">Idade:</label>
            <div class="col-sm-3">          
              <input type="text" class="form-control" id="idade" value="34" disabled>
            </div>
        </div>

        <div class="form-group">
          <label class="control-label col-sm-3" for="sexo">Sexo:</label>
            <div class="col-sm-3">          
              <input type="text" class="form-control" id="sexo" value="Masculino" disabled>
            </div>
        </div>

        <div class="form-group">
          <label class="control-label col-sm-3" for="altura">Altura:</label>
            <div class="col-sm-3">          
              <input type="text" class="form-control" id="altura" value="1,73" disabled>
            </div>
        </div>
          
        <div class="row col-sm-offset-2 col-md-3">
            <button type="submit" class="btn btn-primary">
                <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Alterar Dados
              </button>
            </div>

            <div class="row col-md-3">
              <a href="dashboard.jsp" type="submit" class="btn btn-primary">
                <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Cancelar
              </a>
            </div>
      </form>
      
        <br><br>
  
        <h1>Alterar Senha</h1>
        <br>
        <form class="form-horizontal">
          
          <div class="form-group">
            <label class="control-label col-sm-3" for="nome">Senha Atual:</label>
            <div class="col-sm-3">
              <input type="password" class="form-control" id="oldpwd" placeholder="Senha Atual">
            </div>
          </div>

          <div class="form-group">
            <label class="control-label col-sm-3" for="pwd">Nova Senha:</label>
            <div class="col-sm-3">          
              <input type="password" class="form-control" id="newpass1" placeholder="Nova Senha">
            </div>
          </div>

          <div class="form-group">
            <label class="control-label col-sm-3" for="pwd">Confirmar Senha:</label>
            <div class="col-sm-3">          
              <input type="password" class="form-control" id="newpass2" placeholder="Confirmar Senha">
            </div>
          </div>

          <div class="row col-sm-offset-2 col-md-3">
            <button type="submit" class="btn btn-primary">
                <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Alterar Senha
              </button>
            </div>

            <div class="row col-md-3">
              <a href="dashboard.jsp" type="submit" class="btn btn-primary">
                <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Cancelar
              </a>
            </div>
        </form>
        <div id="msgtext"></div>
      </div>
  </div>

<script src="resources/js/minhaConta.js"></script>
<%@ include file="footer.jsp" %>

</body>
</html>