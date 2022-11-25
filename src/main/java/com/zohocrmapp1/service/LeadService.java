package com.zohocrmapp1.service;


import java.util.List;

import com.zohocrmapp1.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> getLeads();

}
