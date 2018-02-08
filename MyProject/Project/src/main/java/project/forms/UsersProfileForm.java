package project.forms;

import lombok.Data;
import project.models.UsersProfile;
import sun.util.calendar.BaseCalendar;

import java.sql.Date;
import java.time.LocalDateTime;


@Data
public class UsersProfileForm {
    private String name;
    private String lastname;
    private Date birthday;
    private  String phonenumber;

    public void update(UsersProfile usersProfile){
        usersProfile.setName(this.name);
        usersProfile.setLastname(this.lastname);
        usersProfile.setBirthday(this.birthday);
        usersProfile.setPhonenumber(this.phonenumber);
    }
}
