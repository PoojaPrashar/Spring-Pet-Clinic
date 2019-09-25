package poojaprashar.springframework.springpetclinic.services;



import poojaprashar.springframework.springpetclinic.Model.Pet;

import java.util.Set;

public interface PetService {

    Pet findBy(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
