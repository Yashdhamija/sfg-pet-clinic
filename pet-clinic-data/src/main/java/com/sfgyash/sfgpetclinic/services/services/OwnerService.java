package com.sfgyash.sfgpetclinic.services.services;

import com.sfgyash.sfgpetclinic.services.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
