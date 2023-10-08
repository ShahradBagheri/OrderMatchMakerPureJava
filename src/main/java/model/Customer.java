package model;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import java.time.LocalDate;

@Entity
public class Customer extends User{

    private String firstname;

    private String lastname;

    private LocalDate registrationDate;

    @PrePersist
    private void onCreate(){
        registrationDate = LocalDate.now();
    }
}
