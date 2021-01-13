package com.oded.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/hi")
	public ResponseEntity<String> getMessage1(){
		
		//return ResponseEntity.ok().body("Hello");
		
		String name=null;
		try {
		
		name.toUpperCase();
		}catch(NullPointerException e) {
			throw new NoNameException("message");
		}
		//System.err.println("code wont exectue");
		return null;
		
	}
//	@ExceptionHandler(NoNameException.class)
//	public String showExce(Model model) {
//		return "No Name Found";
//	}

}
