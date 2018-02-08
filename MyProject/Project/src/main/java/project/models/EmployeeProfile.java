package project.models;

import lombok.*;

import javax.persistence.*;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="users_profile_id")
    private UsersProfile usersProfileId;



}
