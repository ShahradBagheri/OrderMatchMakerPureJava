package model;

import lombok.Data;
import model.enumeration.ExpertStatus;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Expert{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ExpertStatus expertStatus;

    @Lob
    private byte[] imageData;

    private Float score;

    @ManyToMany
    private List<SubService> subServices;

    @OneToMany
    private List<Order> orders;

    @OneToOne
    private User user;
}
