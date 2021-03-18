package denis.guru.spring.petclinic.services.map;

import denis.guru.spring.petclinic.model.Owner;
import denis.guru.spring.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements CrudService <Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findALL();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save( Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
