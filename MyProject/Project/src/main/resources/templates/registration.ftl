<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring>
<@spring.bind "model"/>
<!Doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Jobik</title>
    <link rel="stylesheet" type="text/css" href="/css/style_registration.css">
</head>
<body>
<!-- Основной блок сайта -->
<div id="basic">
    <!-- Шапка сайта и Верхнее меню сайта -->
    <#if model.user??>
        <#include 'common/header_logout.ftl'/>
    <#else>
        <#include 'common/header_login.ftl'/>
    </#if>
    <!-- Контент -->
    <div id="content">
        <div >
            <h1 align="center"> Как бы Вы хотели зарегестрироваться? </h1>
            <p id="word-interval" align="center">
                <font size="5">
                    <a href="/registration_employer">Работодатель</a>
                    ИЛИ
                    <a href="/registration_employee">Работник</a>
                </font>
            </p>
        </div>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>

</div>
</body>
</html>