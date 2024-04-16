package com.akhil.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.dao.IcrmRepository;
import com.akhil.model.Customer;

@Service
public class crmServiceImpl implements IcrmServiceRepository {

	@Autowired
	IcrmRepository repo;

	@Override
	public List<Customer> fetchData() {	
		return (List<Customer>) repo.findAll();
	}

	@Override
	public boolean checkData(Integer id) {
		return repo.existsById(id);
		
	}

	@Override
	public Customer insertingData(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Optional<Customer> findById(Integer id) {
		
		return repo.findById(id);
	}

	@Override
	public void deletingData(Integer id) {
		repo.deleteById(id);
		
	}
	
	
	
	
}
