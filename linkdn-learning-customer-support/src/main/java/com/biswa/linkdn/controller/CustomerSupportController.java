package com.biswa.linkdn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.biswa.linkdn.entity.CustomerSupport;
import com.biswa.linkdn.service.CustomerSupportService;

@RestController(value = "/customer")
public class CustomerSupportController {

	@Autowired
	private CustomerSupportService customerSupportService;

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerSupport> addCustomerSupport(@RequestBody CustomerSupport customerSupport) {
		CustomerSupport savedCustomerSupport = customerSupportService.addCustomerSupport(customerSupport);
		return new ResponseEntity<CustomerSupport>(savedCustomerSupport, HttpStatus.OK);
	}
}
