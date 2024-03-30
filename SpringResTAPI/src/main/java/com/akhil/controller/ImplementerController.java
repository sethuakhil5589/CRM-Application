package com.akhil.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.Entity.Implementer;

@RestController
public class ImplementerController {
	
	@GetMapping("/report")
	public ResponseEntity<Implementer> showData(){
		
		return new ResponseEntity<Implementer>(new Implementer(101,"Akhil","Hyderabad",true),HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody Implementer impl){
		
		System.out.println(impl);
		
		return new ResponseEntity<String> ("Data Saved Successfully",HttpStatus.OK);
	}
}
