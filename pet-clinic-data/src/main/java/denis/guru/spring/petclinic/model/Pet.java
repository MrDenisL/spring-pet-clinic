package denis.guru.spring.petclinic.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name ="pets")
@Data
public class Pet extends BaseEntity {

    @Column(name ="name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    @Column(name ="birth_date")
    private LocalDate birthdayDate;


}
