package com.biswa.linkdn.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.biswa.linkdn.entity.CustomerSupport;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class CustomerSupportServiceUnitTest {

	@Autowired
	private CustomerSupportService customerSupportService;

	@org.junit.jupiter.api.Test
	public void testAddCustomerSupportHappyPath() {

		CustomerSupport customerSupport = new CustomerSupport("John", "Shipra");
		CustomerSupport newCustomerSupport = customerSupportService.addCustomerSupport(customerSupport);

		assertNotNull(newCustomerSupport);
		assertEquals(customerSupport, newCustomerSupport);
	}
}
