package com.virtusa.customerapidemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.customerapidemo.models.Address;
import com.virtusa.customerapidemo.models.Customer;
import com.virtusa.customerapidemo.repositories.AddressRepository;
@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepo;
	public void saveAddress(Address address, Customer customer) {
		address.setCustomer(customer);
		this.addressRepo.save(address);
	}
}
