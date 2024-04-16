package com.akhil.controller;

import java.util.List;
import java.util.Optional;

import com.akhil.model.Customer;

public interface IcrmServiceRepository {
	List<Customer> fetchData();
	
	boolean checkData(Integer id);
	
	Customer insertingData(Customer customer);
	
	Optional<Customer> findById(Integer id);
	
	void deletingData(Integer id);
}
