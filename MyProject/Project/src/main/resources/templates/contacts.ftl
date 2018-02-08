<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<!Doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Наши контакты</title>
    <link rel="stylesheet" type="text/css" href="/css/style_contacts.css">
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
            <h1 align="center"> Свяжитесь с нами </h1>
            <div class="title"> Контактная информация</div>
            <div class="columns">
                <div class="title-s cb2"> Единый номер по всей России</div>
                <div class="title-s"> +7 (3435) 25-60-60</div>
            </div>
            <div class="epg">
                <div class="title-s cb2"> Адрес</div>
                <div class="title-s"> Казань, ул. Губкина, д.78, корп.7, лит. Б, 5 этаж</div>
            </div>
            <div class="title"> Почтовые адреса</div>
            <table width="960px">
                <tbody>
                <tr>
                    <td><p style="font-size:20px"> Служба поддержки: </p></td>
                    <td><a href="mailto:support@jobik.ru" style="font-size:20px">support@jobik.ru</a></td>
                </tr>
                <tr>
                    <td><p style="font-size:20px"> Сообщения о спаме и вредоносных событиях:</p></td>
                    <td><a href="mailto:abuse@jobik.ru" style="font-size:20px">abuse@jobik.ru</a></td>
                </tr>
                <tr>
                    <td><p style="font-size:20px">Юридический отдел (для официальных запросов):</p></td>
                    <td><a href="mailto:law@jobik.ru" style="font-size:20px">law@jobik.ru</a></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
</div>
</body>
</html>