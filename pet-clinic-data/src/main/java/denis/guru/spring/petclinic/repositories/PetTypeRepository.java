package denis.guru.spring.petclinic.repositories;

import denis.guru.spring.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
