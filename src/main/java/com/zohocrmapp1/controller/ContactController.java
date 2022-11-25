package com.zohocrmapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp1.entities.Contact;
import com.zohocrmapp1.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	@RequestMapping("/listcontacts")
public String contactController(ModelMap model) {
		List<Contact> contacts=contactService.getContacts();
		model.addAttribute("contacts", contacts);
	return "list_contacts";
}
	@RequestMapping("/findByContactId")
	public String findOneContact(@RequestParam("id")long id,ModelMap model) {
		Contact contact=contactService.getOneContact(id);
		model.addAttribute("contact", contact);
		return "contact_info";
		
	}
}
