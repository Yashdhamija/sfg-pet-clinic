package com.sfgyash.sfgpetclinic.services.services;

import com.sfgyash.sfgpetclinic.services.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
