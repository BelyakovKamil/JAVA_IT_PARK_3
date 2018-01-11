package ru.itpark.models.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * @author Kamil Belyakov
 */
@Entity
@Table(name = "employee_profile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class EmployeeProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean empBook;
    private int workExp;
    private boolean medBook;
    private int raiting;
    private String category;
    private Long usersProfileID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isEmpBook() {
        return empBook;
    }

    public void setEmpBook(boolean empBook) {
        this.empBook = empBook;
    }

    public int getWorkExp() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public boolean isMedBook() {
        return medBook;
    }

    public void setMedBook(boolean medBook) {
        this.medBook = medBook;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
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
