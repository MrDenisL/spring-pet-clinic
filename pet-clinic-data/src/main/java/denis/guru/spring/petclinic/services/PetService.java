package denis.guru.spring.petclinic.services;

import denis.guru.spring.petclinic.model.Owner;
import denis.guru.spring.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet findByLastName(String LastName);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
