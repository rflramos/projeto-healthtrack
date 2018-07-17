<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>Confirmar Nova Senha</title>
  <meta name="description" content="ALTERAR SENHA">
  <%@ include file="header.jsp" %>
  <link rel="stylesheet" href="resources/css/confirmNovSenha.css">
 </head>

<body background="image/planoazul.png">
  <div class="container-fluid">

    <div class="row col-md-6">
      <head>
        <h1>Informar nova Senha</h1>
        <dd>Mínimo de 6 caracteres alphanumericos</dd>
      </head>

    <form class="form-horizontal">

      <div class="form-group">
        <label class="control-label col-sm-3" for="pwd">Nova Senha:</label>
        <div class="col-sm-3">          
          <input type="password" class="form-control" id="newpass1" placeholder="Nova Senha">
        </div>
      </div>

      <div class="form-group">
        <label class="control-label col-sm-3" for="confirmasenha">Confirmar Senha:</label>
        <div class="col-sm-3">          
          <input type="password" class="form-control" id="newpass2" placeholder="Confirmar Senha">
        </div>
      </div>
      
      <div class="row col-md-4 COL-SM-OFFSET-1">
        <a href="login.jsp" type="submit" class="btn btn-primary">
          <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Continuar
        </a>
      </div>

      <div class="row col-md-3">
        <a href="login.jsp" type="submit" class="btn btn-primary">
          <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Cancelar
        </a>
      </div><br><br>
      <div id="msgtext"></div>
    </form>
    </div>
</div>

  <script src="resources/js/confirmNovSenha.js"></script>
  <%@ include file="footer.jsp" %>

</body>
</html>