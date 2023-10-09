package model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class MainService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<SubService> subServices;
}
