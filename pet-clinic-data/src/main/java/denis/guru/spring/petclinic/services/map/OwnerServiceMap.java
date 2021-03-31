package denis.guru.spring.petclinic.services.map;

import denis.guru.spring.petclinic.model.Owner;
import denis.guru.spring.petclinic.model.Pet;
import denis.guru.spring.petclinic.services.OwnerService;
import denis.guru.spring.petclinic.services.PetService;
import denis.guru.spring.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    private final PetService petService;

    @Override
    public Set<Owner> findAll() {
        return super.findALL();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        pet.setPetType(petTypeService.save(pet.getPetType()));

                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());

                    }
                });
            }
            return super.save(object);
        } else
            return null;

    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String LastName) {
        return null;
    }
}
