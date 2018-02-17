package project.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String hashPassword;
    private LocalDateTime registrationTime;
    private String confirmCode;
    private LocalDateTime expiredDate;
    private String lastname;
    private Date birthday;
    private String phonenumber;

    @Enumerated(value = EnumType.STRING)
    private State state;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "users")
    private UsersProfile usersProfile;
}
