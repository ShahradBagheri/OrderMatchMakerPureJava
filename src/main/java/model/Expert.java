package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.enumeration.ExpertStatus;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Expert{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ExpertStatus expertStatus;

    @Lob
    private byte[] imageData;

    private Float score;

    @OneToMany(mappedBy = "expert")
    private List<Rating> ratings;

    @OneToMany(mappedBy = "expert")
    private List<Offer> offers;

    @ManyToOne
    private MainService mainService;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
