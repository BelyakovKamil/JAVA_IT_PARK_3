package project.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "location_of_organization")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class LocationOfOrganization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;
    private String subjectOfCountry;
    private String city;
    private String adress;
    private int postIndex;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_of_employer")
    private OrganizationOfEmployer organizationOfEmployer;

}
