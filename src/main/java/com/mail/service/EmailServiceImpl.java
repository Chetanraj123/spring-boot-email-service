package com.mail.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.mail.model.EmailModel;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmailServiceImpl implements IEmailService{

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	public void sendEmail(EmailModel emailModel) {
		
		MimeMessage mimeMessage  = javaMailSender.createMimeMessage();
		
		try {
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
			
			mimeMessageHelper.setTo(emailModel.getToEmail());
			mimeMessageHelper.setCc(emailModel.getCcEmail());
			mimeMessageHelper.setSubject(emailModel.getEmailSubject());
			mimeMessageHelper.setText(emailModel.getEmailBody());
			
			FileSystemResource fileSystemResource = new FileSystemResource(new File(emailModel.getEmailAttachment()));
			
			mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
			
			javaMailSender.send(mimeMessage);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}

	
	
}
