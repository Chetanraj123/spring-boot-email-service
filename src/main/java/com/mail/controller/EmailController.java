package com.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.model.EmailModel;
import com.mail.service.IEmailService;

@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private IEmailService iEmailService;
	
	@PostMapping("/send")
	public ResponseEntity<String> sendEmail(@RequestBody EmailModel emailModel){
		iEmailService.sendEmail(emailModel);
		
		return ResponseEntity.ok("Email Sent Successfully");
	}
}
