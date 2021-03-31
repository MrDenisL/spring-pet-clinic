package denis.guru.spring.petclinic.repositories;

import denis.guru.spring.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository <Speciality,Long> {
}
