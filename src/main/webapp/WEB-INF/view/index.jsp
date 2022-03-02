<%@ page import="def.FactoryProvider"%><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 27-Feb-22
  Time: 12:40 AM
  To change this template use File | Settings | File Templates.
--%>
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
