package model;

import lombok.Data;
import model.enumeration.ExpertStatus;

import javax.persistence.*;

@Data
@Entity
public class Expert{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ExpertStatus expertStatus;

    @Lob
    private byte[] imageData;

    private Long userId;
}