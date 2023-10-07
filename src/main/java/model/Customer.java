package model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Customer extends User{

    private String firstname;

    private String lastname;

    private LocalDate registrationDate;
}
