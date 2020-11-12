<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
Czy na pewno chcesz usunać autora?
<a href="/author/delete/${id}">Potwierdź</a><br/>
<a href="/author/list">Anuluj</a>
</body>
</html>
