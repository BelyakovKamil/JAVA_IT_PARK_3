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
  <#include 'common/header_success.ftl'/>
    <!--Контент -->
    <div id="content">
        <div>
            <h1 align="center">Здраствуйте, Вы удачно зарегистрировались на сайте <span style="font-family:Willful"><a
                    href="/">Jobik.ru</a></span></h1>
            <h1><p align="center">Теперь <a href="/login"> войдите </a> </p></h1>
        </div>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
</div>
</body>
</html>