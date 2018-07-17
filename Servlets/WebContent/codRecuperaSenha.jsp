<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
  <title>Código de Recuperação</title>
  <meta name="description" content="CODIGO RECUPERAÇÃO">
  <%@ include file="header.jsp" %>
  <link rel="stylesheet" href="resources/css/codigo_senha.css">
</head>

<body background="image/planoazul.png">
	<div class="container-fluid">
		<div class="row col-md-12"><br>

			<head>
  				<h1>Código de Recuperação</h1><br>
  				<dd>Digite o código enviado para seu e-mail</dd>
			</head>

  			<form>
  				<div class="form-group input-group">
            	<input type="text" class="form-control" id="codigo" placeholder="Digite o código">
        	</div>

        	<a href="confirmNovSenha.jsp" type="submit" class="btn btn-primary">
          	<span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Continuar
          </a>
            
          <a href="login.jsp" type="submit" class="btn btn-primary col-md-offset-1">
            <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Cancelar
          </a>
        </form>
    </div>
  </div>

      <%@ include file="footer.jsp" %>
</body>
</html>


