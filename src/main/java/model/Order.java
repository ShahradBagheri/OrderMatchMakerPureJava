package model;

import lombok.Data;
import model.enumeration.OrderState;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private SubService subService;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Expert expert;

    private Double suggestedPrice;

    private String details;

    private LocalDate completionDate;

    private String address;

    private OrderState orderState;
}
