<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${greet}</h1><br>
	<form:form action="${pageContext.request.contextPath}/ProductAdd" method="POST" modelAttribute="product">
		<label>Nombre: </label>
		<form:input type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:red;"></form:errors><br>
		
		<label>Marca: </label>
		<form:input type="text" name="marca" path="marca"/>
		<form:errors path="marca" cssStyle="color:red;"></form:errors><br>
		
		<label>Descripc&iacute;on: </label>
		<form:textarea type="text" name="descripcion" path="descripcion"/>
		<form:errors path="descripcion" cssStyle="color:red;"></form:errors><br>
		
		<label>Precio: </label>
		<form:input type="number"  step="any" name="precio" path="precio"/>
		<form:errors path="precio" cssStyle="color:red;"></form:errors><br>
		
		<label>Fecha de Vencimiento: </label>
		<form:input type="date" name="fechaVencimiento" field="*{fechaVencimiento}" path="fechaVencimiento"/>
		<form:errors path="fechaVencimiento" cssStyle="color:red;"></form:errors><br>
		
		<input type="submit" value="IngresarProducto">
	</form:form>
</body>
</html>