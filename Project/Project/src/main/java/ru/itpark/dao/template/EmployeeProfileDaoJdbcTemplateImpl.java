package ru.itpark.dao.template;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import ru.itpark.dao.EmployeeProfileDao;

//public class EmployeeProfileDaoJdbcTemplateImpl implements EmployeeProfileDao {
//    //language=SQl
//    private static final String SQL_INSERT_EMPLOYEE="INSERT INTO employee_profile(emp_book, work_exp, med_book, rating, category)" +"VALUES (?,?,?,?,?)";
//    //language=SQl
//    private  static final  String SQL_SELECT_BY_ID="SELECT * FROM employee_profile WHERE id=?";
//    //language=SQl
//    private  static final  String SQL_SELECT_
//}
