<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
  
  <title>Recuperar Senha</title>
  <meta name="description" content="RECUPERAR SENHA">
  <%@ include file="header.jsp" %>
  <link rel="stylesheet" href="resources/css/recuperar_senha.css">
  
</head>

<body background="image/planoazul.png">

	<div class="container-fluid">
    <BR>

		<div class="row col-md-4">
			<head>
  				<h1>Esqueceu sua Senha?</h1><br>
  				<dd>Digite aqui seu e-mail para recuperação da senha</dd>
			</head>
		 	<form>
  				<div class="form-group input-group">
            		<span class="input-group-addon" id="emailrecover">@</span>
            		<input type="email" class="form-control" id="email" placeholder="Digite o e-mail">
        		</div>

        		<div class="row col-md-5">
        		<a href="codRecuperaSenha.jsp" type="submit" class="btn btn-primary">
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
  
  <script src="resources/js/recuperar_senha.js"></script>
  <%@ include file="footer.jsp" %>

</body>
</html>


