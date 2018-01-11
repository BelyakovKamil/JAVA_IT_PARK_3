package ru.itpark.models.entity;

import lombok.*;

import javax.persistence.*;
/**
 * @author Kamil Belyakov
 */
@Entity
@Table(name = "location_of_organization")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class LocationOfOrganizationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String subjectOfCountry;
    private String city;
    private String adress;
    private int postIndex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSubjectOfCountry() {
        return subjectOfCountry;
    }

    public void setSubjectOfCountry(String subjectOfCountry) {
        this.subjectOfCountry = subjectOfCountry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }
}
