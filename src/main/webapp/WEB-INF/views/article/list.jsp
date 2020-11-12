<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Articles</title>
</head>
<body>
<table>
    <tr>
        <th>Tytuł</th>
        <th>Autor</th>
        <th>Treść</th>
        <th>Utworzony</th>
        <th>Edytowany</th>
    </tr>
    <c:forEach items="${articles}" var="article">
        <tr>
            <td>${article.title}</td>
            <td>${article.author.fullName}</td>
            <td>${article.content}</td>
            <td>${article.created}</td>
            <td>${article.updated}</td>
            <td>
                <a href="/article/form/${article.id}">Edytuj</a>
            </td>
            <th>
                <a href="/article/confirm/${article.id}">Usuń</a>
            </th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
