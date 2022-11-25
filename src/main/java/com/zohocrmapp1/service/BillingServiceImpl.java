package com.zohocrmapp1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp1.entities.Billing;
import com.zohocrmapp1.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
@Autowired
private BillingRepository billingRepo;
	@Override
	public void saveOneBill(Billing billing) {
		billingRepo.save(billing);
	}

}
