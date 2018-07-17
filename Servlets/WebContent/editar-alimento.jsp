<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Atualização do Alimento</title>
<%@ include file="header.jsp" %>
</head>
<body>
<%@ include file="menu.jsp" %>
<div class="container">
  <h1>Edição de Alimento</h1>
  
  <c:if test="${not empty msg }">
    <div class="alert alert-success">${msg}</div>
</c:if>
<c:if test="${not empty erro }">
  <div class="alert alert-danger">${erro}</div>
</c:if>
  
  <form action="alimentacao" method="post">
    <input type="hidden" value="editar" name="acao">
    <input type="hidden" value="${alimento.cd_alimento }" name="codigo">
    <div class="form-group">
      <label for="id-alimento">Alimento</label>
      <input type="text" name="ds_alimento" id="ds_alimento" class="form-control" value="${alimento.ds_alimento }" >
    </div>
    <div class="form-group">
      <label for="id-fabricacao">Data de registro</label>
      <input type="text" name="dt_registro" id="id-data" class="form-control" 
        value='<fmt:formatDate value="${alimentacao.dt_registro.time }" pattern="dd/MM/yyyy"/>'>
    </div>
    <div class="form-group">
      <label for="id-valor">Calorias</label>
      <input type="text" name="calorias" id="vl_calorias_ganhas" class="form-control" value="${alimento.vl_calorias_ganhas }">
    </div>
        
    <input type="submit" value="Salvar" class="btn btn-primary">
    <a href="alimentacao?acao=listar" class="btn btn-danger">Cancelar</a>
  </form>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>