<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Подтвреждение</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div id="basic">
    <!-- Шапка сайта и Верхнее меню сайта -->
    <#if model.user??>
        <#include 'common/header_logout.ftl'/>
    <#else>
        <#include 'common/header_login.ftl'/>
    </#if>
    <!--Контент -->
    <div id="content">
<#if model.result == true>
    <h1>Вы успешно подтвердили почту</h1>
<#else>
    <h1>Ссылка не верна, либо истекло время жизни</h1>
</#if>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
</body>
</html>