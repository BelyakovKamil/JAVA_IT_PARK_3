<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring>
<@spring.bind "model"/>
<!Doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Отзывы о Jobik</title>
    <link rel="stylesheet" type="text/css" href="/css/style_reviews.css">
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
        <div>
            <h1 align="center"> Отзывы о сайте <span style="font-family:Willful"><a href="/"><font color="#4c281e">Jobik.ru</font></a></span>
            </h1>
            <table>
            </table>
        </div>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>

</div>
</body>
</html>