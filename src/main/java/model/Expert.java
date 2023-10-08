package model;

import model.enumeration.ExpertStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expert{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ExpertStatus expertStatus;

    private Long userId;
}
