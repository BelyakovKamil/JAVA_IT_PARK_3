package ru.itpark.dao;

import java.util.List;

public interface EmployeeProfileDao extends CrudDao<EmployeeProfileDao> {
    List<EmployeeProfileDao> findAllByHaveEmpBook(boolean empBook);
    List<EmployeeProfileDao> findAllByHaveNotEmpBook(boolean empBook);
    List<EmployeeProfileDao> findAllByWorkExp(int workExp);
    List<EmployeeProfileDao> findAllByHaveMedBook(boolean medBook);
    List<EmployeeProfileDao> findAllByHaveNotMedBook(boolean medBook);
    List<EmployeeProfileDao> findAllByRaiting(int raiting);
    List<EmployeeProfileDao> findAllByCategory(String category);
}
