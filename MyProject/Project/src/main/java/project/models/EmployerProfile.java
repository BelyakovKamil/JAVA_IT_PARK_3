package project.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employer_profile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class EmployerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String organizationName;
    private int raiting;
    private String category;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "org_id")
    private OrganizationOfEmployer orgId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_profile_id")
    private UsersProfile usersProfileId;
}
