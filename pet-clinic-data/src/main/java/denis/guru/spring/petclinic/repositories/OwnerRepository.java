package denis.guru.spring.petclinic.repositories;

import denis.guru.spring.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
}
