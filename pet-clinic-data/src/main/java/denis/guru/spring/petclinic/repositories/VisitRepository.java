package denis.guru.spring.petclinic.repositories;

import denis.guru.spring.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {


}
