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
    <#--<!-- Шапка сайта и Верхнее меню сайта &ndash;&gt;-->

                        <#if model.user??>

        <#include 'common/header_logout.ftl'/>
    <!--Контент -->
                <div id="content">
                    <div>
                        <h1 align="center"><#if model.user.name??> Приветствуем Вас, ${model.user.name}, на сайте <span style="font-family:Willful"><a
                                href="/">Jobik.ru</a></span></h1><#else> Админпанель</#if>
                    </div>
                </div>
            <div class="myclr"></div>
        <!-- Подвал -->
        <#include 'common/footer.ftl'/>
    <#else>
        <#include 'common/header_login.ftl'/>
                <!--Контент -->
                <div id="content">
                    <div>
                        <h1 align="center">Приветствуем Вас на сайте <span style="font-family:Willful"><a
                                href="/">Jobik.ru</a></span></h1>
                        <p>Если Вы молодой и энергичный и Вам очень нужна работа, то наш сайт то, что Вам нужно! В нашей
                            базе данных
                            сотни работодателей, которым, возможно, нужны именно Вы! </p>
                        <p>А если Вам нужны работники, то Вам тоже крупно повезло! В на шей базе данных также имеются
                            люди, которые
                            хотят поработать на Вас</p>
                    </div>
                </div>
            <div class="myclr"></div>
        <!-- Подвал -->
        <#include 'common/footer.ftl'/>
    </#if>
</div>
</body>
</html>
