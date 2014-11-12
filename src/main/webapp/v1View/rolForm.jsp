<?xml version="1.0" encoding="UTF-8"  ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Formulario de Rol</title>
</head>
<body>
	<h1>Formulario de Rol</h1>
	<c:set var="rb" scope="session" value="${rolBean}" />
	<form action="/ServletsJSPJDBC/v1/crearRol" method="post">
		<p>Rol actuales:</p>
		<ul>
			<c:forEach var="rol" items="${rb.roles}">
				<li>${rol}</li>
			</c:forEach>
		</ul>
		<p>
			Rol nuevo: <input name="rol" type="text" value="" />
		</p>
		<p>
			<input type="submit" value="Enviar" />
		</p>
	</form>
    <p><a href="/ServletsJSPJDBC/v1/home">Volver a Home</a></p>
</body>
</html>
