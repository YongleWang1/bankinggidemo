package com.virtusa.customerapidemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.customerapidemo.models.Address;


public interface AddressRepository extends JpaRepository<Address,Long>{

}
