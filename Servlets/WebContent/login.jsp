<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
    <title>Login</title>
    <meta name="description" content="LOGIN">
	<%@ include file="header.jsp" %>
    <link rel="stylesheet" href="resources/css/login.css">
</head>

<body background="image/login.png">

    <div class="container">
    
        <div class="row col-md-4">
        
            <header>
                <h1>HEALTH TRACK</h1>
                <h2>Seja Bem Vindo!!!</h2>
                <dd>Entre com seu login e senha</dd>
            </header>

            <div class="row col-md-12">
            
                <main>
                
                    <form>
                        <div class="form-group input-group">
                            <span class="input-group-addon" id="emailspam">@</span>
                            <input type="email" class="form-control" id="email" placeholder="Digite o email">
                        </div>
            
                        <div class="form-group input-group">
                            <span class="input-group-addon glyphicon glyphicon-lock" id="pwdspan"></span>
                            <input type="password" class="form-control" id="pwd" placeholder="Digite a senha">
                        </div>

                        <div class="checkbox" >
                            <label><input type="checkbox">Lembrar senha</label>
                        </div>

                        <div class="form-group input-group">
                            <a href="recuperarSenha.jsp" target="recuperar senha">Recuperar Senha</a>
                        </div>

                        <a href="dashboard.jsp" type="submit" class="btn btn-primary">
                            <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Continuar
                        </a>
                    </form>

                    <div id="msgtext"></div>
                
                </main>
            
            </div>      
        </div>
    </div>
    
<%@ include file="footer.jsp" %>
<script src="resources/js/login.js"></script>

</body>
</html>

