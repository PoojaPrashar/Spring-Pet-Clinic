package poojaprashar.springframework.springpetclinic.services;

import poojaprashar.springframework.springpetclinic.Model.Vet;

import java.util.Set;

public interface VetService {

    Vet findBy(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();




}
