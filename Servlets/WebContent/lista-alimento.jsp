<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Alimentos</title>
<%@ include file="header.jsp" %>
</head>
<body>

<%@ include file="menu.jsp" %>

  <div class="container">
    <h1>Alimentos</h1>
    <table class="table table-striped">
      <tr>
        <th>Alimento</th>
        <th>Data</th>
        <th>Calorias</th>
        <th></th>    
      </tr>
      <c:forEach items="${alimentos }" var="a">
        <tr>
          <td>${a.ds_alimento}</td>
          <td>
            <fmt:formatDate value="${a.dt_registro.time }" pattern="dd/MM/yyyy"/>
          </td>
          <td>${a.vl_calorias_ganhas}</td>
          <td>
          <c:url value="alimentacao" var="link">
              <c:param name="acao" value="abrir-form-edicao"/>
              <c:param name="codigo" value="${a.cd_alimento }"/>
            </c:url>
            <a href="${link}">Editar</a>
          </td>
          
         </tr>
      </c:forEach>
    </table>
  </div>
<%@ include file="footer.jsp" %>

</body>
</html>