package denis.guru.spring.petclinic.services.map;

import denis.guru.spring.petclinic.model.Speciality;
import denis.guru.spring.petclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialtiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findALL();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void delete(Speciality object) {

        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
