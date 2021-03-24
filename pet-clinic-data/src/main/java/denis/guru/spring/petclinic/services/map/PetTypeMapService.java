package denis.guru.spring.petclinic.services.map;

import denis.guru.spring.petclinic.model.PetType;
import denis.guru.spring.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long>implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findALL();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }
}
