package com.oded.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<Object> hadleNullPointer(Model model) {
		return new ResponseEntity<Object>("Global Exception",HttpStatus.BAD_REQUEST);
		
	}
	@ExceptionHandler(NoNameException.class)
	public ResponseEntity<Object> showExce(Model model) {
		return new ResponseEntity<Object>("Global Exception No Name",HttpStatus.BAD_REQUEST);
	}
}
