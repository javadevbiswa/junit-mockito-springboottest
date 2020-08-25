package com.biswa.linkdn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biswa.linkdn.entity.CustomerSupport;
import com.biswa.linkdn.repo.CustomerSupportRepository;

@Service
public class CustomerSupportService {

	@Autowired
	private CustomerSupportRepository customerSupportRepository;

	public CustomerSupport addCustomerSupport(CustomerSupport customerSupport) {

		return customerSupportRepository.save(customerSupport);

	}
}
