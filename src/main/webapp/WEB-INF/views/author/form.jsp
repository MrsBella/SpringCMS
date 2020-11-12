<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Author form</title>
</head>
<body>
<form:form action="/author/form" modelAttribute="author">
    <form:hidden path="id"/>

    <form:label path="firstName">Imię: </form:label>
    <form:input path="firstName"/>
    <br>

    <form:label path="lastName">Nazwisko: </form:label>
    <form:input path="lastName"/>
    <br>

    <button type="submit">Wyślij</button>
</form:form>
</body>
</html>
