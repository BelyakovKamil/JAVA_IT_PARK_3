<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<!Doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Jobik</title>
    <link rel="stylesheet" type="text/css" href="/css/style_registration_employer.css">
</head>
<body>

<script>
    function checkPP() {
        document.getElementById('buttonv');
        buttonv.disabled = true;
        if (document.getElementById('pass').value != document.getElementById('conf').value) {
            alert("Пароль и подтверждение пароля не совпадают!");
            buttonv.disabled = true;
        }
        else {
            alert("Пароли совпадают!");
            buttonv.disabled = false;

        }
    }
</script>
<script>
    function Contrys(){
        document.getElementById('selectCountry');
        document.getElementById('selectCityRussia');
        document.getElementById('selectCityUkraine');
        document.getElementById('selectCityBelarus');

        if(selectCountry.value=="Россия"){
            selectCityRussia.disabled=false;
            selectCityRussia.style.display='block';
            selectCityBelarus.disabled=true;
            selectCityBelarus.style.display='none';
            selectCityUkraine.disabled=true;
            selectCityUkraine.style.display='none';
        } else
        if(selectCountry.value=="Беларусь"){
            selectCityBelarus.disabled=false;
            selectCityBelarus.style.display='block';
            selectCityRussia.disabled=true;
            selectCityRussia.style.display='none';
            selectCityUkraine.disabled=true;
            selectCityUkraine.style.display='none';
        }else{
            selectCityUkraine.disabled=false;
            selectCityUkraine.style.display='block';
            selectCityBelarus.disabled=true;
            selectCityBelarus.style.display='none';
            selectCityRussia.disabled=true;
            selectCityRussia.style.display='none';
        }
    }
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
              action="/registration_employer">
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
            <h2 align="center"> Сведения об организации</h2>
            <h4 align=center>Страна</h4>
            <#--<input type="text" name="country" placeholder="Страна" required pattern="[а-яА-Я]+$">-->
            <select id="selectCountry" name="country" onchange="Contrys()">
                <option>Выберите страну</option>
                <option id="Russia" value="Россия">Россия</option>
                <option id="Ukraine" value="Украина">Украина</option>
                <option id="Belarus" value="Беларусь">Беларусь</option>
            </select>
            <h4 align=center>Субъект страны</h4>
            <input type="text" name="subjectOfCountry" placeholder="Субъект страны" pattern="[а-яА-Я]+$">
            <h4 align=center>Город</h4>
            <#--<input type="text" name="city" placeholder="Город" required pattern="[а-яА-Я]+$">-->
            <select id="selectCityRussia" name="city" value="Россия" style="display:none" disabled="disabled" >
                <option>Москва</option>
                <option>Санкт-Петербург</option>
                <option>Казань</option>
            </select>
            <select id="selectCityUkraine" name="city" value="Украина" style="display:none" disabled="disabled">
                <option>Киев</option>
                <option>Одесса</option>
                <option>Харьков</option>
            </select>
            <select id="selectCityBelarus" name="city" value="Беларусь" style="display:none" disabled="disabled">
                <option>Минск</option>
                <option>Брест</option>
                <option>Витебск</option>
            </select>
            <h4 align=center>Адрес</h4>
            <input type="text" name="adress" placeholder="Адрес (улица,дом)" required>
            <h4 align=center>Почтовый индекс</h4>
            <input type="number" name="postIndex" placeholder="Почтовый индекс" pattern="{6}">
            <h4 align=center>Название организации</h4>
            <input type="text" name="orgName" placeholder="Название организации">
            <h4 align=center>Телефон организации</h4>
            <input type="text" name="orgPhonenumber" placeholder="Телефон организации (+7...) (8...)"
                   pattern="(\+7|8)9[0-9]{2}[0-9]{3}[0-9]{2}[0-9]{2}">
            <#--<h4 align=center>Рейтинг организации</h4>-->
            <#--<input type="number" name="orgRaiting" placeholder="Рейтинг организации">-->
            <h4 align=center>Дата создания организации</h4>
            <input type="date" name="dateOfCreation" placeholder="Дата создания">
            <h4 align=center>Сайт организации</h4>
            <input type="url" name="site" placeholder="Сайт">
            <h4 align=center>Пароль</h4>
            <input type="password" name="password" id="pass" placeholder="Пароль (минимум 6 символов из букв и цифр)"
                   required pattern="[a-zA-Z0-9]{6,30}">
            <h4 align=center>Повторите пароль</h4>
            <input type="password" name="confirmpassword" id="conf" placeholder="Повторите пароль" required
                   pattern="[a-zA-Z0-9]{6,30}" onblur="checkPP()">
            <br>
            <br>
            <button id="buttonv" type="submit" disabled="disabled">Зарегистрироваться</button>

        </form>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
</div>
</body>
</html>