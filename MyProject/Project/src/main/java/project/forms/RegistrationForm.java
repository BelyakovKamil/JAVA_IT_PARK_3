package project.forms;

import lombok.Data;
import lombok.ToString;


import java.sql.Date;



@Data
@ToString

public class RegistrationForm {
    private String name;
    private String email;
    private String password;
    private String lastname;
    private Date birthday;
    private String phonenumber;
    private String empBook;
    private int workExp;
    private String medBook;
    private int raiting;
    private String category;
    private String orgName;
    private Date dateOfCreation;
    private String site;
    private String country;
    private String subjectOfCountry;
    private String city;
    private String adress;
    private int postIndex;
    private String orgPhonenumber;
    private int orgRaiting;
}
