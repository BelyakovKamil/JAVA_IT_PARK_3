package ru.itpark.models.hbutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.itpark.dao.LocationOfOrganizationDao;
import ru.itpark.models.entity.*;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author Kamil Belyakov
 */
public class HibernateUtil {
    //Создаем нашу SessionFactory.
    private static SessionFactory sessionFactory;

    static {
        try {
            //Создаем новый екземпляр AnnotationConfiguration
           AnnotationConfiguration ac = new AnnotationConfiguration();
            //Это нам нужно для того, чтобы мы добавили все наши классы сущности.
            //каждый ваш Entity здесь нужно прописать, не пропишете - не будет работать.
            ac.addAnnotatedClass(EmployeeProfileEntity.class).addAnnotatedClass(EmployerProfileEntity.class)
                    .addAnnotatedClass(LocationOfOrganizationEntity.class).addAnnotatedClass(OrganizationOfEmployerEntity.class)
                    .addAnnotatedClass(UsersEntity.class).addAnnotatedClass(UsersProfileEntity.class);
            //Вот мы собственно и создали нашу Фабрику сессий.
            //Она нужна т.к с БД мы работаем через сессии
        } catch (Throwable e){
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
