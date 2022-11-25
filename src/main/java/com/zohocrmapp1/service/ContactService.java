package com.zohocrmapp1.service;

import java.util.List;

import com.zohocrmapp1.entities.Contact;

public interface ContactService {
public void saveOneContact(Contact contact);

public List<Contact> getContacts();

public Contact getOneContact(long id);
}
