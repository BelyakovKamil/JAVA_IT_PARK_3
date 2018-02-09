<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<!Doctype html>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Jobik</title>
    <link rel="stylesheet" type="text/css" href="/css/style_main.css">
    <script type="text/javascript" src="/js/main.js"></script>
</head>
<body>
<script>
    function updateProfile(name) {
        $.ajax({
            type: "POST",
            url:"/users/${model.user.id}",
            data:{
                "firstName": name,
                // "lastname": lastname,
            },
            error: function (data) {
                alert(data.status)
            },
            succes: function (data) {
                alert("Профиль был успешно изменен")
            }
        })
    }
</script>
<!-- Основной блок сайта -->
<div id="basic">
    <#--<#if model.user></#if>-->
    <!-- Шапка сайта и Верхнее меню сайта -->
    <#include 'common/header_logout.ftl'/>
    <!--Контент -->
    <div id="content">
        <div>
            <h1 align="center">Приветствуем Вас,<font color="#ff9c00"> ${model.user.name} </font></h1>
            <form class="form-module" title="Регистрация"
                  name="registrationForm">
            <input type="text" id="firstName" name="name" value="${model.user.name}"/>
            <#--<input type="text" id="lastName" name="lastname" value="${model.userProfil.lastname}"/>-->
            <#--<input type="text" id="organization" name="organization" value="${model.user.organization}"/>-->
            <#--<input type="text" id="phonenumber" name="phonenumber" value="${model.user.phonenumber}"/>-->
            <button onclick="updateProfile(
            document.getElementById('firstName').value,
            // document.getElementById('lastName').value
            // document.getElementById('organization').value,
            // document.getElementById('phonenumber').value)
            ">Изменить</button>
            </form>
        </div>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
</div>
</body>
</html>