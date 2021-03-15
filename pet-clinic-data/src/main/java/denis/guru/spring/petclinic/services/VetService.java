package denis.guru.spring.petclinic.services;

import denis.guru.spring.petclinic.model.Pet;
import denis.guru.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet findByLastName(String LastName);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
