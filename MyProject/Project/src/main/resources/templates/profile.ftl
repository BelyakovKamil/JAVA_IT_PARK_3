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
        <div>
            <h1 align="center">Приветствуем Вас, ${model.user.email}</h1>
        </div>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
</div>
</body>
</html>