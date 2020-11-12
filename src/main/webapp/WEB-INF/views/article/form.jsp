<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Article form</title>
</head>
<body>
<form:form action="/article/form" modelAttribute="article">
    <form:hidden path="id"/>

    <form:label path="title">Tytuł: </form:label>
    <form:input path="title"/>
    <br>

    <form:label path="content">Treść: </form:label>
    <form:input path="content"/>
    <br>

    <form:label path="author">Autor: </form:label>
    <form:select path="author" items="${authors}" itemLabel="fullName" itemValue="id"/>
    <br>

    <form:label path="categories">Kategoria: </form:label>
    <form:select path="categories" items="${categories}" itemLabel="name" itemValue="id" multiple="true"/>
    <form:errors path="categories" cssClass="error"/>
    <br>

    <button type="submit">Wyślij</button>
</form:form>
</body>
</html>
