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
	<h1>Demonio!!!</h1>
    <c:set var="cPersona" scope="request" value="${crearPersona}" />
	<p>Se te cambia el nombre a: ${cPersona.persona.nombre}</p>
	
    <p><a href="/ServletsJSPJDBC/v1/home">Volver a Home</a></p>

</body>
</html>
