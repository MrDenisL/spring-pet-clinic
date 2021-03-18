package denis.guru.spring.petclinic.services.map;

import denis.guru.spring.petclinic.model.Owner;
import denis.guru.spring.petclinic.model.Pet;
import denis.guru.spring.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
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
        return super.save(object.getId(),object);
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
