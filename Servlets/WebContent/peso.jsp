<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

	<meta name="description" content="PESO">

	<%@ include file="header.jsp" %>
	<link rel="stylesheet" href="resources/css/gerenciar_peso.css">
</head>

<body>
  	
  	<div class="container-fluid">
  		<nav class="navbar navbar-inverse">
  			<div class="navbar-header">
      			<p class="navbar-brand">REGISTRE SEU PESO</p>
      			<%@ include file="menu.jsp"  %>
   			</div>
    	</nav>

 			
    	<div class="row col-md-12">
    		<button type="button" class="btn btn-primary btn-sm">
    			<span class="glyphicon glyphicon-plus"></span>
    		</button>
    		<button type="button" class="btn btn-danger btn-sm">
    			<span class="glyphicon glyphicon-remove"></span>
    		</button>

 			<table class="table table-hover">

 				<thead>	
				  <tr>
				  	<th><input type="checkbox"></th>
				    <th>Peso kg</th>
				    <th>Data</th>
				    <th>Observações</th>
				    <th id="botao">Ações</th>
				  </tr>
				</thead>

				<tbody>
				  <tr>
				  	<td><input type="checkbox"></td>
				    <td>73</td>
				    <td>11/06/2017</td>
				    <td>Nenhum</td>
				    <td>
				    	<button type="button" class="btn btn-primary btn-sm">
				    		<span class="glyphicon glyphicon-pencil"></span>
				    	</button>
				    	<button type="button" class="btn btn-danger btn-sm">
				    		<span class="glyphicon glyphicon-trash"></plus>
				    	</button>
				    </td>
				  </tr>

				  <tr>
				  	<td><input type="checkbox"></td>
				    <td>73</td>
				    <td>11/06/2017</td>
				    <td>Nenhum</td>
				    <td>
				    	<button type="button" class="btn btn-primary btn-sm">
				    		<span class="glyphicon glyphicon-pencil"></span>
				    	</button>
				    	<button type="button" class="btn btn-danger btn-sm">
				    		<span class="glyphicon glyphicon-trash"></plus>
				    	</button>
				    </td>
				  </tr>

				  <tr>
				  	<td><input type="checkbox"></td>
				    <td>73</td>
				    <td>11/06/2017</td>
				    <td>Nenhum</td>
				    <td>
				    	<button type="button" class="btn btn-primary btn-sm">
				    		<span class="glyphicon glyphicon-pencil"></span>
				    	</button>
				    	<button type="button" class="btn btn-danger btn-sm">
				    		<span class="glyphicon glyphicon-trash"></plus>
				    	</button>
				    </td>
				  </tr>

				  <tr>
				  	<td><input type="checkbox"></td>
				    <td>73</td>
				    <td>11/06/2017</td>
				    <td>Nenhum</td>
				    <td>
				    	<button type="button" class="btn btn-primary btn-sm">
				    		<span class="glyphicon glyphicon-pencil"></span>
				    	</button>
				    	<button type="button" class="btn btn-danger btn-sm">
				    		<span class="glyphicon glyphicon-trash"></plus>
				    	</button>
				    </td>
				  </tr>

				  <tr>
				  	<td><input type="checkbox"></td>
				    <td>73</td>
				    <td>11/06/2017</td>
				    <td>Nenhum</td>
				    <td>
				    	<button type="button" class="btn btn-primary btn-sm">
				    		<span class="glyphicon glyphicon-pencil"></span>
				    	</button>
				    	<button type="button" class="btn btn-danger btn-sm">
				    		<span class="glyphicon glyphicon-trash"></plus>
				    	</button>
				    </td>
				  </tr>
				</tbody>

				</table>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>