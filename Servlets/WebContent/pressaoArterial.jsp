<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
  
  	<meta name="description" content="PRESSÃO">
	<%@ include file="header.jsp" %>
	<link rel="stylesheet" href="resources/css/pressao_arterial.css">

</head>

<body>
  	
  	<div class="container-fluid">
  		<nav class="navbar navbar-inverse">
  			<div class="navbar-header">
      			<p class="navbar-brand">REGISTRE SUA PRESSÃO ARTERIAL</p>
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

				  <tr>
				  	<th><input type="checkbox"></th>
				    <th id="sistolica">Sistólica/Diastólica (mmHg)</th>
				    <th>Data</th>
				    <th>Situação</th>
				    <th id="botao">Ações</th>
				  </tr>

				  <tr>
				  	<td><input type="checkbox"></td>
				    <td>120/80</td>
				    <td>11/06/2017</td>
				    <td>Normal</td>
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
				    <td>120/80</td>
				    <td>11/06/2017</td>
				    <td>Normal</td>
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
				    <td>120/80</td>
				    <td>11/06/2017</td>
				    <td>Normal</td>
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
				    <td>120/80</td>
				    <td>11/06/2017</td>
				    <td>Normal</td>
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
				    <td>120/80</td>
				    <td>11/06/2017</td>
				    <td>Normal</td>
				    <td>
				    	<button type="button" class="btn btn-primary btn-sm">
				    		<span class="glyphicon glyphicon-pencil"></span>
				    	</button>
				    	<button type="button" class="btn btn-danger btn-sm">
				    		<span class="glyphicon glyphicon-trash"></plus>
				    	</button>
				    </td>
				  </tr>

				</table>
		</div>
	</div>

	<%@ include file="footer.jsp" %>
     
</body>
</html>