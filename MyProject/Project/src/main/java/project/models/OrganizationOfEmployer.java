package project.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "organization_of_employer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class OrganizationOfEmployer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orgName;
    private String orgPhonenumber;
    private long orgRaiting;
    private Date dateOfCreation;
    private String site;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private LocationOfOrganization locationId;
}
