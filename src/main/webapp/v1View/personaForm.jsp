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
	<c:set var="pb" scope="request" value="${personaBean}" />
	<form action="/ServletsJSPJDBC/v1/crearPersona" method="get">
		<p>
			Id: <input id="id" type="text" value="${pb.id}" />
		</p>
		<p>
			Nombre: <input id="nombre" type="text" value="${pb.nombre}" />
		</p>
		<p>
			<input id="sub" type="submit" value="Enviar" />
		</p>
	</form>
</body>
</html>
