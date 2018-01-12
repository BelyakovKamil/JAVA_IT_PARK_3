package ru.itpark.models.hbutil;

import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.itpark.models.entity.EmployeeProfileEntity;

/**
 * @author Kamil Belyakov
 */
public class HibernateUtil {
    //Создаем нашу SessionFactory.
//    private static final SessionFactory sessionFactory;

    static {
        try {
            //Создаем новый екземпляр AnnotationConfiguration
//            AnnotationConfiguration ac = new AnnotationConfiguration().addAnnotatedClass(EmployeeProfileEntity.class);
            //Это нам нужно для того, чтобы мы добавили все наши классы сущности.
            //каждый ваш Entity здесь нужно прописать, не пропишете - не будет работать.
//            ac.addAnnotatedClass(EmployeeProfileEntity.class)
        } catch (Throwable e){
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }
}
