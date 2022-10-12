<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- IMPORTAR ETIQUETAS (TAGS) DE STRUTS Y ETIQUETAS DE JAVA SCRIPT)  -->
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ModuloAlta</title>
</head>
<s:head/>
<sx:head/>
<body>
<sx:tabbedpanel id="formAlta">
	<sx:div label="FORMULARIO ALTA - USERCAP">
		<s:form action="alta.action" method="post">
			<s:textfield key="nombre" label="NOMBRE" />
			<s:password key="password" label="PASSWORD" />
			<s:radio name="genero" label="GENERO" list="#{'Masculino':'MASCULINO',
			'Femenio':'FEMENINO'}" />
			<s:checkboxlist name="idioma" label="IDIOMA" list="#{'Esp':'ESPAÑOL',
			'Ale':'ALEMAN','Por':'PORTUGUES','Ing':'INGLES'}" />
			<s:select name="ciudad" label="CIUDAD" list="#{'Pue':'PUEBLA','Oax':'OAXACA',
			'Tlax':'TLAXCALA','Mor':'MORELOS','Mich':'MICHOACAN','Leo':'LEON'}" 
			headerKey="1" headerValue="Selecciona Ciudad" />
			<sx:datetimepicker key="fecha" label="FECHA" displayFormat="dd/MM/yyyy" />
			<sx:autocompleter name="tipo" label="TIPO" list="#{'User':'USER',
			'Root':'ROOT','Admin':'ADMIN'}" />
			<s:textarea key="comentario" label="COMENTARIO" />
			<s:submit value="Envíar Datos" />
		</s:form>
	</sx:div>
</sx:tabbedpanel>
</body>
</html>