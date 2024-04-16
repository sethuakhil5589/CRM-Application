package com.akhil.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akhil.model.Customer;
@Repository
public interface IcrmRepository extends CrudRepository<Customer, Integer> {

}
