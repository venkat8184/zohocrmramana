package com.zohocrmapp1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp1.entities.Contact;
import com.zohocrmapp1.repositories.ContactRepository;
@Service
public class ContatcServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveOneContact(Contact contact) {
            contactRepo.save(contact);
	}

	@Override
	public List<Contact> getContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> contact = contactRepo.findById(id);
		return contact.get();
	}

}
