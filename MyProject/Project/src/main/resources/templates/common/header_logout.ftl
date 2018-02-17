<header>
    <!-- Шапка сайта -->
    <div id="head-site">
        <a href="/"><img src="../img/logo.png" alt="Jobic.ru-Найди работу себе или другому!"></a>
        <img src="../img/telefon.png" alt="+7 (3435) 25-60-60" title="+7 (3435) 25-60-60" class="telefon"/>
    </div>
    <!-- Верхнее меню сайта -->
    <div id="top-menu">
        <div class="bg-1">
            <ul>
                <li><a href="/profile">Профиль</a></li>
<#if model.user.role=="ADMIN">
    <li><a href="/find?order_by">Поиск</a></li>
<#elseif model.user.usersProfile.employerProfile??>
                <li><a href="/find_employee?order_by">Поиск</a></li>
<#else>
                <li><a href="/find_employer?order_by">Поиск</a></li>
</#if>
                <li><a href="/about">О проекте</a></li>
                <li><a href="/contacts">Контакты</a></li>
                <li class="none-bg"><a href="/logout">Выход</a></li>
            </ul>
        </div>
        <div class="bg-2"></div>
    </div>
</header>