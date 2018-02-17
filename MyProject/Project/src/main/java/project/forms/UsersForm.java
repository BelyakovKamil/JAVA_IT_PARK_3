package project.forms;

import lombok.Data;
import project.models.Users;

import java.sql.Date;

@Data
public class UsersForm {
    private Long userId;
    private String name;
    private String password;
    private String email;
    private String lastname;
    private Date birthday;
    private String phonenumber;

    public  void  update(Users users){
        users.setId(this.userId);
        users.setName(this.name);
        users.setEmail(this.email);
        users.setLastname(this.lastname);
        users.setBirthday(this.birthday);
        users.setPhonenumber(this.phonenumber);
    }
}
