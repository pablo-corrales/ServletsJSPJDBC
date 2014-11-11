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
	<h1>Utilización de Servlets, Beans, JSPs y JSTLs</h1>
	<h2>Acceso a objetos</h2>
	<c:set var="p1" value="${requestScope['beanPersona']}" />
	<c:set var="p2" scope="request" value="${beanPersona}" />
	<c:set var="p3" scope="session" value="${beanPersona}" />
	<c:set var="p4" scope="application" value="${beanPersona}" />

	<p>Id: ${p1.id}</p>
	<p>Nombre: ${p1.nombre}</p>

	<h2>Sentencia if</h2>
	<c:if test="${p1.id == 666}">
		<p>Dentro del if: es un demonio</p>
	</c:if>

	<h2>Sentencia else-if</h2>
	<c:choose>
		<c:when test="${p1.id==1}">
			<p>Es 1</p>
		</c:when>
		<c:when test="${p1.id==2}">
			<p>Es 2</p>
		</c:when>
		<c:otherwise>
			<p>Es mayor que 2</p>
		</c:otherwise>
	</c:choose>

	<h2>Colecciones</h2>
	<p>Roles:</p>
	<ul>
		<c:forEach var="rol" items="${p1.roles}">
			<li>${rol}</li>
		</c:forEach>
	</ul>
</body>
</html>
