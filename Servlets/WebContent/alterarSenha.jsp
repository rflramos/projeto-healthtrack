<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  
  <meta charset="utf-8">
  <meta name="description" content="ALTERAR SENHA">
  <meta name="author" content="Rafael Ramos">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="IE-edge">
  <link rel="stylesheet" href="css/bootstrap.min.css">
 
  
</head>

<body>

<div class="container-fluid">

  <head><h1>Alterar Senha</h1></head>

  <br>

  <div class="row col-md-6">

  <form class="form-horizontal">

    <div class="form-group">
      <label class="control-label col-sm-3" for="nome">Senha Atual:</label>
      <div class="col-sm-3">
        <input type="password" class="form-control" id="senhaatual" placeholder="Senha Atual">
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-3" for="pwd">Nova Senha:</label>
      <div class="col-sm-3">          
        <input type="password" class="form-control" id="novasenha" placeholder="Nova Senha">
      </div>
  </div>

      <div class="form-group">
        <label class="control-label col-sm-3" for="confirmasenha">Confirmar Senha:</label>
        <div class="col-sm-3">          
          <input type="password" class="form-control" id="confirmasenha" placeholder="Confirmar Senha">
        </div>
    </div>

    <div class="row col-md-4">
            <button type="submit" class="btn btn-primary">
                <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Continuar
              </button>
            </div>

            <div class="row col-md-3">
              <button type="submit" class="btn btn-primary">
                <span class="glyphicon glyphicon-ok-sign" aria-hidden="true"></span> Cancelar
              </button>
            </div>
</div>
</div>

  </form>
  
  </div>
</div>

	  <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>

</body>
</html>