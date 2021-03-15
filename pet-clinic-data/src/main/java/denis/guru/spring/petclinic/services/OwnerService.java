package denis.guru.spring.petclinic.services;

import denis.guru.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner findByLastName(String LastName);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
