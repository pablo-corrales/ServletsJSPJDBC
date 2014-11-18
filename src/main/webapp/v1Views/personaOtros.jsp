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
    <h1>Desconocido!!!</h1>
    <c:set var="cPersona" scope="request" value="${crearPersona}" />
    <p>Id: ${cPersona.persona.id}</p>
    <p>Nombre: ${cPersona.persona.nombre}</p>
    <p>Rol: ${cPersona.persona.rol}</p>
    <p><a href="/ServletsJSPJDBC/v1/home">Volver a Home</a></p>

</body>
</html>
