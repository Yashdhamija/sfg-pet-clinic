package com.sfgyash.sfgpetclinic.services.services;

import com.sfgyash.sfgpetclinic.services.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
