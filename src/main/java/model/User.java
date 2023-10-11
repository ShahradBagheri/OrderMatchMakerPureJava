package model;

import lombok.Data;
import model.enumeration.Role;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;

    private String firstname;

    private String lastname;

    private LocalDate registrationDate;

    private Role role;

    @PrePersist
    private void onCreate(){
        registrationDate = LocalDate.now();
    }
}
