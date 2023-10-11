package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.enumeration.OrderState;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

    private LocalDate startingDate;

    private String address;

    private OrderState orderState;
}
