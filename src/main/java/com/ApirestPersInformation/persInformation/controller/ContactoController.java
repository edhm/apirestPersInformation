package com.ApirestPersInformation.persInformation.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApirestPersInformation.persInformation.model.ContactoModel;
import com.ApirestPersInformation.persInformation.service.ContactoService;

@RestController
@RequestMapping("/contacto")
public class ContactoController {
	@Autowired
	ContactoService contactoService;

	@GetMapping
	public ArrayList<ContactoModel> showPersonalInformation() {
		return contactoService.showPersonalInformation();
	}

	@PostMapping
	public ContactoModel registerPersonalInformation(@RequestBody ContactoModel contacto) {
		return this.contactoService.registerPersonalInformation(contacto);
	}

	@GetMapping(path = "/{id}")
	public Optional<ContactoModel> searchPersonalInfirmation(@PathVariable("id") Long id) {
		return this.contactoService.searchPersonalInfirmation(id);
	}

	@DeleteMapping(path = "/{id}")
	public String deletePersonalInformation(@PathVariable("id") Long id) {
		boolean ok = this.contactoService.deletePersonalInformation(id);
		if (ok) {
			return "Cotancto  con ID eliminado: " + id;
		} else {
			return "Contacto con ID no hallado: " + id;
		}
	}

}
