<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authors</title>
</head>
<body>
<table>
    <tr>
        <th>Imię</th>
        <th>Nazwisko</th>
    </tr>
    <c:forEach items="${authors}" var="author">
        <tr>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td>
                <a href="/author/form/${author.id}">Edytuj</a>
            </td>
            <th>
                <a href="/author/confirm/${author.id}">Usuń</a>
            </th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
