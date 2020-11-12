<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories</title>
</head>
<body>
<table>
    <tr>
        <th>Nazwa</th>
        <th>Opis</th>
    </tr>
    <c:forEach items="${categories}" var="category">
        <tr>
            <td>${category.name}</td>
            <td>${category.description}</td>
            <td>
                <a href="/category/form/${category.id}">Edytuj</a>
            </td>
            <th>
                <a href="/category/confirm/${category.id}">Usuń</a>
            </th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
