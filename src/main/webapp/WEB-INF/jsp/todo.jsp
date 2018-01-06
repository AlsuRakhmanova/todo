<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
    Hello ${fn:escapeXml(name)}
   
</body>
</html>