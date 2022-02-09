package com.ApirestPersInformation.persInformation.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApirestPersInformation.persInformation.model.ContactoModel;
import com.ApirestPersInformation.persInformation.repository.ContactoRepositorty;

@Service
public class ContactoService {
	@Autowired
	ContactoRepositorty contactoRepository;

	public ArrayList<ContactoModel> showPersonalInformation() {
		return (ArrayList<ContactoModel>) contactoRepository.findAll();
	}

	public ContactoModel registerPersonalInformation(ContactoModel contacto) {
		return contactoRepository.save(contacto);
	}
	public Optional<ContactoModel> searchPersonalInfirmation(Long id){
		return contactoRepository.findById(id);
	}
	public boolean deletePersonalInformation(Long id) {
		try {
			contactoRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
			// TODO: handle exception
		}
	}
}
