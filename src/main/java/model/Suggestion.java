package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Suggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate creationDate;

    private LocalDate startingDate;

    private LocalDate completionDate;

    private Double suggestedPrice;

    @PrePersist
    private void onCreate(){
        creationDate = LocalDate.now();
    }
}
