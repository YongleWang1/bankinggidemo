package com.virtusa.customerapidemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.customerapidemo.models.Address;
import com.virtusa.customerapidemo.models.Customer;
import com.virtusa.customerapidemo.services.AddressService;
import com.virtusa.customerapidemo.services.CustomerService;
@RestController
public class AddressController {
	@Autowired
	private AddressService addressService;
	@Autowired
	private CustomerService customerService;
	@PostMapping("/customers/{customerId}")
	public String addAddress(@RequestBody Address address,@PathVariable int customerId) {
		Customer customer = customerService.getCustomerById(customerId);
		if(customer!=null) {
			addressService.saveAddress(address, customer);
			return "save address successfully";
		}
		else
			return "cannot found customerId";
	}
}