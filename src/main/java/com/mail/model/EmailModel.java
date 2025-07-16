package com.mail.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {

	private String toEmail;
	private String ccEmail;
	private String emailSubject;
	private String emailBody;
	private String emailAttachment;
	
	public EmailModel() {
		super();
	}

	public EmailModel(String toEmail, String ccEmail, String emailSubject, String emailBody, String emailAttachment) {
		super();
		this.toEmail = toEmail;
		this.ccEmail = ccEmail;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;
		this.emailAttachment = emailAttachment;
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getCcEmail() {
		return ccEmail;
	}

	public void setCcEmail(String ccEmail) {
		this.ccEmail = ccEmail;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getEmailAttachment() {
		return emailAttachment;
	}

	public void setEmailAttachment(String emailAttachment) {
		this.emailAttachment = emailAttachment;
	}

	@Override
	public String toString() {
		return "EmailModel [toEmail=" + toEmail + ", ccEmail=" + ccEmail + ", emailSubject=" + emailSubject
				+ ", emailBody=" + emailBody + ", emailAttachment=" + emailAttachment + "]";
	}
	
	
	
	
}
