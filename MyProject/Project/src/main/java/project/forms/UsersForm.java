package project.forms;

import lombok.Data;
import project.models.Users;

@Data
public class UsersForm {
    private String name;
    private String password;
    private String email;
    private String lastname;

    public  void  update(Users users){
        users.setName(this.name);
        users.setEmail(this.email);
    }
}
