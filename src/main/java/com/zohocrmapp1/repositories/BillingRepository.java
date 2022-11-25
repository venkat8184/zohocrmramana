package com.zohocrmapp1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmapp1.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
