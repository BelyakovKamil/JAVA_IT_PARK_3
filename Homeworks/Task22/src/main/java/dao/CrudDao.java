package dao;

import java.util.List;

/**
 * Created by Kamil on 29.12.2017.
 */
public interface CrudDao<T> {
    void sava(T model);
    T find(int id);
    void update(T model);
    void delete(int id);

    List<T> findAll();
}
