package ru.itpark.dao.template;

import org.hibernate.Criteria;
import org.hibernate.Session;
import ru.itpark.dao.UsersDao;
import ru.itpark.models.entity.UsersEntity;
import ru.itpark.models.hbutil.HibernateUtil;


import java.util.List;

public class UsersDaoImpl implements UsersDao {
    @Override
    public List<UsersEntity> getUsers() {
        List<UsersEntity> result = null;
        //Создаем сессию, она нужна для использования транзакций
        //Грубо говоря, транзакция - это как точка восстановления, если не прошла до конца, то все изменения откатываются.
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            //Criteria используется  для запроса с целью получения данных из БД
            //Такой формулировки, думаю, Вам пока хватит
            //Параметром мы передаем тот класс-сущность, который используем. Если бы данные получали из таблицы Cart то передавать
            //надо было бы Cart.class
            Criteria criteria = session.createCriteria(UsersEntity.class);
            result = (List<UsersEntity>) criteria.list();
        } catch (Exception e) {
            //Обработку исключений обязательно пишите. Но это я оставлю Вам на самостоятельную работу.
            e.printStackTrace();
        } finally {
            if (session != null) session.close();
        }
        return result;
    }
}

