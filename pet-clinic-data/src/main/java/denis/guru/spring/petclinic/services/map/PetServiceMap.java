package denis.guru.spring.petclinic.services.map;

import denis.guru.spring.petclinic.model.Owner;
import denis.guru.spring.petclinic.model.Pet;
import denis.guru.spring.petclinic.services.CrudService;
import denis.guru.spring.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findALL();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save( Pet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
