package denis.guru.spring.petclinic.services;

import denis.guru.spring.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String LastName);

}
