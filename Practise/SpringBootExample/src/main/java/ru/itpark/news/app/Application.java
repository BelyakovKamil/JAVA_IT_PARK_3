package ru.itpark.news.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//анноттация, которая говорит, что
//данный класс будет точкой входа в приложение
//а также содержит конфигурацию приложения
@SpringBootApplication
//аннотация, которая говорит Спрингу
//где искать компоненты для связывания(аннотации @Autowired, @Component)
@ComponentScan(basePackages = "ru.itpark.news")
//говорим, где лежат классы, котрые будут
//объектом взаимодействия с бд
@EntityScan(basePackages = "ru.itpark.ru.itpark.news.models")
//говорим, что наши репозитории описаны в данном пакете
//Spring JPA сам сгенерирует для них реализацию
@EnableJpaRepositories(basePackages = "ru.itpark.news.repositories")
//Выключили(зачем-то) безопасность, чтобы было норм
//@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)


public class Application {
    //просто запускаем приложение
    public static void main(String[] args) {
        SpringApplication.run(Application.class);

    }
}
