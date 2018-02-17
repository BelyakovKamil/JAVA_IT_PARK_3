package project.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "employee_profile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class EmployeeProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empBook;
    private int workExp;
    private String medBook;
    private int raiting;
    private String category;
    private String name;
    private String lastname;
    private String phonenumber;
    private Date birthday;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="users_profile_id")
    private UsersProfile usersProfile;



}
