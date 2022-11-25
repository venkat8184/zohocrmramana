package com.zohocrmapp1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp1.entities.Lead;
import com.zohocrmapp1.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
@Autowired
private LeadRepository leadRepo;
	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteOneLead(long id) {
		leadRepo.deleteById(id);
	}
	@Override
	public List<Lead> getLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
