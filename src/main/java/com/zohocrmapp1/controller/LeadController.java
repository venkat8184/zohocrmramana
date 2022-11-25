package com.zohocrmapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp1.entities.Contact;
import com.zohocrmapp1.entities.Lead;
import com.zohocrmapp1.service.ContactService;
import com.zohocrmapp1.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private ContactService contact;
	@Autowired
	private LeadService leadService;
	@RequestMapping("/createViewLeadPage")
public String createViewLeadPage() {
	return "create_lead";
}
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id,Model model) {
		Lead lead=leadService.getOneLead(id);
		Contact c=new Contact();
		c.setEmail(lead.getEmail());
		c.setMobile(lead.getMobile());
		c.setFirstName(lead.getFirstName());
		c.setLastName(lead.getLastName());
		contact.saveOneContact(c);
		leadService.deleteOneLead(id);
		List<Contact> contacts=contact.getContacts();
		model.addAttribute("contacts", contacts);
	return "list_contacts";
	}
	@RequestMapping("/listall")
	public String getLeads(ModelMap model) {
		List<Lead> leads=leadService.getLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
	}
	@RequestMapping("/findById")
	public String findOneLead(@RequestParam("id")long id,Model model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}
