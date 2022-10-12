<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- IMPORTAR ETIQUETAS (TAGS) DE STRUTS Y ETIQUETAS DE JAVA SCRIPT)  -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ModuloCiudad</title>
</head>
<s:head/>
<sx:head/>
<body>
<sx:tabbedpanel id="formCiudad">
	<sx:div label="FORMULARIO CATALOGO - CIUDAD">
		<s:radio name="ciudad" label="CIUDAD" list="nombresCiudades" />
		<br>
		<s:checkboxlist name="ciudad" label="CIUDAD" list="nombresCiudades" />
		<br>
		<s:select name="ciudad" label="CIUDAD" list="nombresCiudades" 
		headerKey="1" headerValue="Selecciona Ciudad" />
		<br>
		<sx:autocompleter name="ciudad" label="CIUDAD" list="nombresCiudades" />
		<br>
	</sx:div>
</sx:tabbedpanel>
</body>
</html>