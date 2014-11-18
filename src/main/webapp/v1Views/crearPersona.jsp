<?xml version="1.0" encoding="UTF-8"  ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Formulario de Persona</title>
</head>
<body>
	<h1>Formulario de Persona</h1>
	<c:set var="cPersona" scope="request" value="${crearPersona}" />
	<c:set var="cRol" scope="session" value="${crearRol}" />
	<form action="/ServletsJSPJDBC/v1/crearPersona" method="post">
		<p>
			Id: <input name="id" type="text" value="${cPersona.persona.id}" />
		</p>
		<p>
			Nombre: <input name="nombre" type="text" value="${cPersona.persona.nombre}" />
		</p>
		<p>
			Roles:<select name="rol">
				<c:forEach var="rol" items="${cRol.roles}">
					<li>${rol}</li>
					<option value="${rol}">${rol}</option>
				</c:forEach>
			</select>
		</p>
		<p>
			<input type="submit" value="Enviar" />
		</p>
	</form>
	<p>
		<a href="/ServletsJSPJDBC/v1/home">Volver a Home</a>
	</p>
</body>
</html>
