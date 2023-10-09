package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SubService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double basePrice;

    private String comment;

    @ManyToOne
    private SubService subServices;
}
