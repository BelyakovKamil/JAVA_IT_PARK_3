<%--
  Created by IntelliJ IDEA.
  User: Kamil
  Date: 30.12.2017
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>${hello}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Возраст</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>
<form action="/users_as_jsp" method="post">
    <input type="text" name="name" placeholder="Имя">
    <input type="text" name="age" placeholder="Возраст">
    <input type="submit">
</form>
</body>
</html>
