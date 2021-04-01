package denis.guru.spring.petclinic.services.map;

import denis.guru.spring.petclinic.model.Visit;
import denis.guru.spring.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findALL();
    }

    @Override
    public void deleteById(Long aLong) {
    super.deleteByID(aLong);
    }

    @Override
    public void delete(Visit object) {
    super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null){
            throw new RuntimeException("invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
