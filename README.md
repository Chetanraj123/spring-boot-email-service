# spring-boot-email-service

Spring Boot Email Service using Java Mail Sender

Required Dependancies:-
1.Spring Boot Dev Tools
2.Spring Web
3.Java Mail Sender
4.Lombok (Option you may generate source code or write it)

You require your own Email and pass for to sending the mail

App Pass:-
1.Go to you account
2.Click on Security
3.Search for App Password
4.Click on it and then create separate password
5.Copy it and use

Application Properties are as follows:-

just add this properties in your existing properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username="Enter Your Email"
spring.mail.password="Enter your App password"
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
