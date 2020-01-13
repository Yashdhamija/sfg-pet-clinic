package com.sfgyash.sfgpetclinic.services;

import com.sfgyash.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
