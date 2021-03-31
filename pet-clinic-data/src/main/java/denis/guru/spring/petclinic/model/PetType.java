package denis.guru.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "types")
@Setter
@Getter
public class PetType extends BaseEntity {
    @Column(name ="name")
    private String name;
}
