<%@ page import="def.FactoryProvider"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<!-- <head>
    <title>Index</title>
</head> -->
<body>
	<h1>Hello World!</h1>
	<%
	out.println(FactoryProvider.getFactory());
	%>
</body> 
</html>
