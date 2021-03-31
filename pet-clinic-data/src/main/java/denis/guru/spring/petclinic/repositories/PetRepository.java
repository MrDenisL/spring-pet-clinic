package denis.guru.spring.petclinic.repositories;

import denis.guru.spring.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {


}
