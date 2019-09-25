package poojaprashar.springframework.springpetclinic.services;

import poojaprashar.springframework.springpetclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findBy(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();



}
