package com.zohocrmapp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp1.entities.Contact;
import com.zohocrmapp1.entities.Lead;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
