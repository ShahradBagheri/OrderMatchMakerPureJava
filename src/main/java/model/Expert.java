package model;

import model.enumeration.ExpertStatus;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import java.time.LocalDate;

@Entity
public class Expert extends User{

    private String firstname;

    private String lastname;

    private ExpertStatus expertStatus;

    private LocalDate registrationDate;

    @PrePersist
    private void onCreate(){
        registrationDate = LocalDate.now();
    }
}
