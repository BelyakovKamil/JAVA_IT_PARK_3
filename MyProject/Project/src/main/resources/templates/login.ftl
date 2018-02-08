<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Войти</title>
    <link rel="stylesheet" type="text/css" href="/css/style_login.css">
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
    <!--Контент -->
    <div id="content">
        <form class="form-module" title="Вход"
              name="registrationForm"
              method="post"
              action="/login">
            <br>
            <label><input type="text" name="email" placeholder="Почта"/></label>
            <br>
            <label><input type="password" name="password" placeholder="Пароль"/></label>
            <p align="center"> <input type="checkbox" name="remember-me">Запомнить</p>
            <button>Войти</button>
            <#if model.error == true>
            <h3 align="center"><font color="#ff9c00"> Неверно введено имя пользователя или пароль</font></h3>
            </#if>
        </form>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
</div>
</body>
</html>