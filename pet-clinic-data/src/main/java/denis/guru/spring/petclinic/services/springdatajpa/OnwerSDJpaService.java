package denis.guru.spring.petclinic.services.springdatajpa;

import denis.guru.spring.petclinic.model.Owner;
import denis.guru.spring.petclinic.repositories.OwnerRepository;
import denis.guru.spring.petclinic.repositories.PetRepository;
import denis.guru.spring.petclinic.repositories.PetTypeRepository;
import denis.guru.spring.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OnwerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OnwerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findByLastName(String LastName) {
        return ownerRepository.findByLastName(LastName);
    }
}
