package ru.itpark.models.entity;

import lombok.*;

import javax.persistence.*;
/**
 * @author Kamil Belyakov
 */
@Entity
@Table(name = "employer_profile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class EmployerProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orgName;
    private int raiting;
    private Long orgID;
    private String category;
    private Long usersProfileID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public Long getOrgID() {
        return orgID;
    }

    public void setOrgID(Long orgID) {
        this.orgID = orgID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getUsersProfileID() {
        return usersProfileID;
    }

    public void setUsersProfileID(Long usersProfileID) {
        this.usersProfileID = usersProfileID;
    }
}
