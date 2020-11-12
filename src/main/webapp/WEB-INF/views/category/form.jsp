<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category form</title>
</head>
<body>
<form:form action="/category/form" modelAttribute="category">
    <form:hidden path="id"/>

    <form:label path="name">Nazwa: </form:label>
    <form:input path="name"/>
    <br>

    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <br>

    <button type="submit">Wyślij</button>
</form:form>
</body>
</html>
