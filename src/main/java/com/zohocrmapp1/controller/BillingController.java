package com.zohocrmapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp1.entities.Billing;
import com.zohocrmapp1.entities.Contact;
import com.zohocrmapp1.service.BillingService;
import com.zohocrmapp1.service.ContactService;

@Controller
public class BillingController {
	@Autowired
	private BillingService billingService;
	@Autowired
	private ContactService contactService;
    @RequestMapping("/findBillById")
	public String getContactById(@RequestParam("id")long id,ModelMap model) {
    	Contact contact = contactService.getOneContact(id);
    	model.addAttribute("contact", contact);
		return "generate_bill";
	}
    @RequestMapping("/saveBill")
    public String saveBill(@ModelAttribute("billing")Billing billing) {
    	billingService.saveOneBill(billing);
    	return "generate_bill";
    }
}
