<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.itpark.models.entity.UsersEntity" %>
<%@ page import="org.omg.CORBA.UserException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>
</head>
<body>
<h1>${hello}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Почта</th>
    </tr>
    <%
        ArrayList<UsersEntity> users = (ArrayList<UsersEntity>) request.getAttribute("users");
        for (UsersEntity user : users) {
    %>
    <tr>
        <td><%=user.getId()%></>
        <td><%=user.getName()%></>
        <td><%=user.getEmail()%></>
    </tr>
    <% } %>
</table>
</body>
</html>
