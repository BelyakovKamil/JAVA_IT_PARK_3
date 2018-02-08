<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<!Doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Jobik</title>
    <link rel="stylesheet" type="text/css" href="/css/style_registration_employee.css">
</head>
<body>

<script>
    <!--
    function checkPP()
    {
        document.getElementById('buttonv');
        buttonv.disabled=true;
        if(document.getElementById('pass').value != document.getElementById('conf').value)
        {
            alert("Пароль и подтверждение пароля не совпадают!");
            buttonv.disabled=true;
        }
        else
        {
            alert("Пароли совпадают!");
            buttonv.disabled=false;

        }
    }
    //-->
</script>
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
        <h3 align="center">Введите свои данные</h3>
        <form class="form-module" title="Регистрация"
              name="registrationForm"
              method="post"
              action="/registration_employee">
            <br>
            <h4 align="center">Имя</h4>
            <input type="text" name="name" placeholder="Имя (кириллица)" required pattern="[а-яА-Я]+$">
            <h4 align="center">Фамилия</h4>
            <input type="text" name="lastname" placeholder="Фамилия (кириллица)" pattern="[а-яА-Я]+$">
            <h4 align="center">Почтовый адрес</h4>
            <input type="email" name="email" placeholder="Почта" pattern="\w+@\w+.(com|ru)$" required>
            <h4 align="center">Номер телефона</h4>
            <input type="tel" name="phonenumber" placeholder="Номер (+7...) (8...)" required
                   pattern="(\+7|8)9[0-9]{2}[0-9]{3}[0-9]{2}[0-9]{2}">
            <h4 align="center">Дата рождения</h4>
            <input type="date" name="birthday" placeholder="Дата рождения">
            <h4 align=center>Профессия</h4>
            <select name="category">
                <option>Программист</option>
                <option>Официант</option>
                <option>Дворник</option>
                <option>Повар</option>
                <option>Дизайнер</option>
            </select>
            <h4 align="center">Трудовая книжка</h4>
            <#--<input type="text" name="empBook" placeholder="Трудовая книжка (Да/Нет)" required pattern="(Да|Нет|да|нет)">-->
            <select name="empBook">
                <option>Да</option>
                <option>Нет</option>
            </select>
            <h4 align="center">Стаж работы</h4>
            <input type="text" name="workExp" placeholder="Стаж работы" required pattern="[0-9]{0,100}">
            <h4 align="center">Медицинская книжка</h4>
            <#--<input type="text" name="medBook" placeholder="Медицинская книжка (Да/Нет)" required pattern="(Да|Нет|да|нет)">-->
            <select name="medBook">
                <option>Да</option>
                <option>Нет</option>
            </select>
            <h4 align="center">Пароль</h4>
            <input type="password" name="password" id="pass" placeholder="Пароль (минимум 6 символов из букв и цифр)" required pattern="[a-zA-Z0-9]{6,30}">
            <h4 align="center">Повторите пароль</h4>
            <input type="password" name="password" id="conf" placeholder="Повторите пароль" required pattern="[a-zA-Z0-9]{6,30}" onblur="checkPP()">
            <br>
            <br>
            <button id="buttonv" type="submit" disabled="disabled" >Зарегистрироваться</button>

        </form>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
</div>
</body>
</html>