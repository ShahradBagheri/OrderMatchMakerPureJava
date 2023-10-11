package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.enumeration.ExpertStatus;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expert{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ExpertStatus expertStatus;

    @Lob
    private byte[] imageData;

    private Float score;

    @OneToMany
    private List<Rating> ratings;

    @ManyToMany
    private List<SubService> subServices;

    @OneToMany
    private List<Order> orders;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
