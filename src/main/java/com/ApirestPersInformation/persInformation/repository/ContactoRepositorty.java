package com.ApirestPersInformation.persInformation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ApirestPersInformation.persInformation.model.ContactoModel;

@Repository
public interface ContactoRepositorty extends CrudRepository<ContactoModel, Long> {

}
