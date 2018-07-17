<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>

  <meta name="description" content="ATIVIDADES">
  <%@ include file="header.jsp" %>
  <link rel="stylesheet" href="resources/css/atividades.css">
  
</head>

<body>
    
    <div class="container-fluid">

      <nav class="navbar navbar-inverse">
        <div class="navbar-header">
            <p class="navbar-brand">REGISTRE SUAS ATIVIDADES</p>
            <%@ include file="menu.jsp"  %>
        </div>
      </nav>

        

          <ul class="nav nav-tabs">
            <li class="active"><a data-toggle="tab" href="#caminhada">Caminhada</a></li>
            <li><a data-toggle="tab" href="#corrida">Corrida</a></li>
            <li><a data-toggle="tab" href="#pedalada">Pedalada</a></li>
            <li><a data-toggle="tab" href="#musculacao">Musculação</a></li>
          </ul>

           <div class="tab-content">

            <div id="caminhada" class="tab-pane fade in active">
               

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
                    <th>Descrição</th>
                    <th>Calorias Gastas</th>
                    <th>Data</th>
                    <th>Hora Inicio</th>
                    <th>Hora Fim</th>
                    <th id="botao">Ações</th>
                  </tr>
                </thead>

                <tbody>
                  <tr>
                    <td><input type="checkbox"></td>
                    <td>Corrida Leve</td>
                    <td>200</td>
                    <td>11/06/2017</td>
                    <td>07h</td>
                    <td>08h</td>
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
                    <td>Corrida Leve</td>
                    <td>200</td>
                    <td>11/06/2017</td>
                    <td>07h</td>
                    <td>08h</td>
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




            <div id="corrida" class="tab-pane fade">
                

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
                    <th>Descrição</th>
                    <th>Calorias Gastas</th>
                    <th>Data</th>
                    <th>Hora Inicio</th>
                    <th>Hora Fim</th>
                    <th id="botao">Ações</th>
                  </tr>
                </thead>

                <tbody>
                  <tr>
                    <td><input type="checkbox"></td>
                    <td>Corrida Leve</td>
                    <td>200</td>
                    <td>11/06/2017</td>
                    <td>07h</td>
                    <td>08h</td>
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
                    <td>Corrida Leve</td>
                    <td>200</td>
                    <td>11/06/2017</td>
                    <td>07h</td>
                    <td>08h</td>
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

            <div id="pedalada" class="tab-pane fade">

              

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
                    <th>Descrição</th>
                    <th>Calorias Gastas</th>
                    <th>Data</th>
                    <th>Hora Inicio</th>
                    <th>Hora Fim</th>
                    <th id="botao">Ações</th>
                  </tr>
                </thead>

                <tbody>
                  <tr>
                    <td><input type="checkbox"></td>
                    <td>Corrida Leve</td>
                    <td>200</td>
                    <td>11/06/2017</td>
                    <td>07h</td>
                    <td>08h</td>
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
                    <td>Corrida Leve</td>
                    <td>200</td>
                    <td>11/06/2017</td>
                    <td>07h</td>
                    <td>08h</td>
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

            <div id="musculacao" class="tab-pane fade">
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
                    <th>Descrição</th>
                    <th>Calorias Gastas</th>
                    <th>Data</th>
                    <th>Hora Inicio</th>
                    <th>Hora Fim</th>
                    <th id="botao">Ações</th>
                  </tr>
                </thead>

                <tbody>
                  <tr>
                    <td><input type="checkbox"></td>
                    <td>Corrida Leve</td>
                    <td>200</td>
                    <td>11/06/2017</td>
                    <td>07h</td>
                    <td>08h</td>
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
                    <td>Corrida Leve</td>
                    <td>200</td>
                    <td>11/06/2017</td>
                    <td>07h</td>
                    <td>08h</td>
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
</div>
  
       <%@ include file="footer.jsp" %>

</body>
</html>
