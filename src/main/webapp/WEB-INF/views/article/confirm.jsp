<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
Czy na pewno chcesz usunać artykuł?
<a href="/article/delete/${id}">Potwierdź</a><br/>
<a href="/article/list">Anuluj</a>
</body>
</html>
