package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class SubService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private Double basePrice;

    private String comment;

    @OneToMany(mappedBy = "mainService")
    private List<Expert> experts;

    @ManyToOne
    @JoinColumn(name = "main_service_id")
    private MainService mainService;
}
