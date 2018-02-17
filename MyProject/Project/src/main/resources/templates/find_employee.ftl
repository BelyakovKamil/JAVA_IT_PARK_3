<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<!Doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Jobik</title>
    <link rel="stylesheet" type="text/css" href="/css/style_main.css">
</head>
<body>
<!-- Основной блок сайта -->
<div id="basic">
    <!-- Шапка сайта и Верхнее меню сайта -->
            <#include 'common/header_logout.ftl'/>
    <!--Контент -->
    <div id="content">
                        <h2 align="center"> Работники</h2>
                        <table>
                            <tr>
                                <th>Имя</th>
                                <th>Фамилия</th>
                                <th>Дата рождения</th>
                                <th>Номер телефона</th>
                                <th>Почта</th>
                                <th>Профессия</th>
                                <th>Трудовая книжка</th>
                                <th>Трудовой стаж</th>
                                <th>Медицинская книжка</th>
                            </tr>
                                        <#list model.users as users>
                                        <tr>
                                            <#if users.role=="EMPLOYEE">
                                            <td>${users.usersProfile.name}</td>
                                            <td>${users.usersProfile.lastname}</td>
                                            <td>${users.usersProfile.birthday}</td>
                                            <td>${users.usersProfile.phonenumber}</td>
                                            <td>${users.email}</td>
                                            <td >${users.usersProfile.employeeProfile.category}</td>
                                            <td>${users.usersProfile.employeeProfile.empBook}</td>
                                            <td>${users.usersProfile.employeeProfile.workExp}</td>
                                            <td>${users.usersProfile.employeeProfile.medBook}</td>
                                            </#if>
                                        </#list>
                        </tr>

                        </table>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
        <#include 'common/footer.ftl'/>
</div>
</body>
</html>