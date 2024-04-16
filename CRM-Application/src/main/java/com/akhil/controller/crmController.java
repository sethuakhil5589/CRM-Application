package com.akhil.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.akhil.model.Customer;

@Controller
public class crmController {
	@Autowired
	private crmServiceImpl service;
	
	@GetMapping("/customers")
	public String fetchingDetails(Map<String,Object> model) {
		List<Customer> cusList = service.fetchData();
		model.put("customers", cusList);
		return "cxdata";
	}
	
	@GetMapping("/showform")
	public String registeringData(@ModelAttribute("cust") Customer cust) {
		return "showform";
	}
	
	@PostMapping("/showform")
	public String registeringData(@ModelAttribute("cust") Customer cust, Map<String,Object>model) {
		model.put("customer", cust);
		System.out.println(cust);
		service.insertingData(cust);
		List<Customer> cusList = service.fetchData();
		model.put("customers", cusList);
		return "cxdata";
	}
	
	@GetMapping("/update/{id}")
	public String updatingData(@PathVariable("id") Integer id,@ModelAttribute Customer cust, Map<String,Object>model) {
		System.out.println(id+" Customer Id from updating data...");
		Optional<Customer> customer = service.findById(cust.getId());
		model.put("customer", customer);
		return	"update";
	}
	
	@PostMapping("/update/{id}")
	public String updatingData(@ModelAttribute("customer") Customer customer, Map<String, Object> model) {
		model.put("customer", customer);
		service.insertingData(customer);
		List<Customer> cusList = service.fetchData();
		model.put("customers", cusList);
		return "redirect:/customers";
	}
	
	@GetMapping("/delete/{id}")
	public String deletingData(@PathVariable("id") Integer id,@ModelAttribute Customer cust, Map<String,Object>model) {
		System.out.println(id+" Customer Id from updating data...");
//		Optional<Customer> customer = service.findById(cust.getId());
//		model.put("customer", customer);
		service.deletingData(id);
		List<Customer> cusList = service.fetchData();
		model.put("customers", cusList);
		return	"redirect:/customers";
	}
}
