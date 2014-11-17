<?xml version="1.0" encoding="UTF-8"  ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>JSTL</title>
</head>
<body>
	<h2>Utilización de Servlets, Beans, JSPs y JSTLs</h2>
	<h2>Acceso a objetos</h2>
	<c:set var="pb" value="${requestScope['personaBeanV0']}" />
	<!--<c:set var="p2" scope="request" value="${personaBean}" />
	<c:set var="p3" scope="session" value="${personaBean}" />
	<c:set var="p4" scope="application" value="${personaBean}" /> -->

	<p>Id: ${pb.id}</p>
	<p>Nombre: ${pb.nombre}</p>

	<h2>Sentencia if</h2>
	<c:if test="${pb.id == 666}">
		<p>Dentro del if: es un demonio</p>
	</c:if>

	<h2>Sentencia else-if</h2>
	<c:choose>
		<c:when test="${pb.id==1}">
			<p>Es 1</p>
		</c:when>
		<c:when test="${pb.id==2}">
			<p>Es 2</p>
		</c:when>
		<c:otherwise>
			<p>Es mayor que 2</p>
		</c:otherwise>
	</c:choose>

	<h2>Colecciones</h2>
	<p>Roles:</p>
	<ul>
		<c:forEach var="rol" items="${pb.roles}">
			<li>${rol}</li>
		</c:forEach>
	</ul>
</body>
</html>
