<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
Czy na pewno chcesz usunać kategorię?
<a href="/category/delete/${id}">Potwierdź</a><br/>
<a href="/category/list">Anuluj</a>
</body>
</html>
