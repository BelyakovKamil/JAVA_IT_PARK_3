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
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<!-- Основной блок сайта -->
<div id="basic">
<#--<#if model.user></#if>-->
    <!-- Шапка сайта и Верхнее меню сайта -->
    <#include 'common/header_logout.ftl'/>
    <#if model.user.role=="ADMIN">
    <h1 align="center">Приветствуем Вас,<font color="#ff9c00"> Админ </font></h1>
    <#else >
    <!--Контент -->
    <div id="content">
        <div>
            <h1 align="center">Приветствуем Вас,<font color="#ff9c00"> ${model.user.usersProfile.name} </font></h1>
            <form class="form-module" title="Ваши данные"
                  name="profileForm">
                <br>
                <h4 align="center">Имя</h4>
                <input disabled  id="firstName" name="name" value="${model.user.usersProfile.name}"/>
                <h4 align="center">Фамилия</h4>
                <input disabled  id="lastName" name="lastName" value="${model.user.usersProfile.lastname}"/>
                <h4 align="center">Дата рождения</h4>
                <input disabled id="birthday" name="birthday" value="${model.user.usersProfile.birthday}"/>
                <h4 align="center">Номер телефона</h4>
                <input disabled id="phonenumber" name="phonenumber" value="${model.user.usersProfile.phonenumber}"/>
                <h4 align="center">Почтовый адрес</h4>
                <input disabled id="email" name="email" value="${model.user.email}"/>

                <#if model.user.usersProfile.employerProfile??>
                <h4 align=center>Профессия</h4>
                            <input disabled type="text" id="category" name="category"
                                   value="${model.user.usersProfile.employerProfile.category}"/>
                <h2 align="center"> Сведения об организации</h2>
                <h4 align=center>Страна</h4>
                <input disabled type="text" id="country" name="country"
                       value="${model.user.usersProfile.employerProfile.organizationOfEmployer.locationOfOrganization.country}"/>
                <h4 align=center>Город</h4>
                            <input disabled type="text" id="city" name="city"
                                   value="${model.user.usersProfile.employerProfile.organizationOfEmployer.locationOfOrganization.city}"/>
                <h4 align=center>Адрес</h4>
                <input disabled type="text" id="adress" name="adress"
                       value="${model.user.usersProfile.employerProfile.organizationOfEmployer.locationOfOrganization.adress}"/>
                <h4 align=center>Почтовый индекс</h4>
                <input disabled type="text" id="postIndex" name="postIndex"
                       value="${model.user.usersProfile.employerProfile.organizationOfEmployer.locationOfOrganization.postIndex}"/>
                <h4 align=center>Название организации</h4>
                <input disabled type="text" id="organizationName" name="organizationName"
                       value="${model.user.usersProfile.employerProfile.organizationOfEmployer.orgName}"/>
                    <h4 align=center>Телефон организации</h4>
                <input disabled type="text" id="orgPhonenumber" name="orgPhonenumber"
                       value="${model.user.usersProfile.employerProfile.organizationOfEmployer.orgPhonenumber}"/>
                            <h4 align=center>Дата создания организации</h4>
                <input disabled type="text" id="dateOfCreation" name="dateOfCreation"
                       value="${model.user.usersProfile.employerProfile.organizationOfEmployer.dateOfCreation}"/>
                <h4 align=center>Сайт организации</h4>
                <input disabled type="text" id="site" name="site"
                       value="${model.user.usersProfile.employerProfile.organizationOfEmployer.site}"/>
                <#else>
                <h4 align=center>Профессия</h4>
                <input disabled type="text" id="category" name="category"
                       value="${model.user.usersProfile.employeeProfile.category}"/>
                <h4 align="center">Трудовая книжка</h4>
                    <input disabled type="text" id="empBook" name="empBook"
                           value="${model.user.usersProfile.employeeProfile.empBook}"/>
                <h4 align="center">Стаж работы</h4>
                <input disabled type="text" id="workExp" name="workExp"
                       value="${model.user.usersProfile.employeeProfile.workExp}"/>
                <h4 align="center">Медицинская книжка</h4>
                            <input disabled type="text" id="medBook" name="medBook"
                                   value="${model.user.usersProfile.employeeProfile.medBook}"/>
                </#if>
            </form>
        </div>
    </div>
    <div class="myclr"></div>
    <!-- Подвал -->
<#include 'common/footer.ftl'/>
    </#if>
</div>
</body>
</html>