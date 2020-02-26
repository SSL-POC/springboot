package com.erp.util;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class PushEmail {
	
	public static final Logger logger = LoggerFactory.getLogger(PushEmail.class);

	    static final String FROM = "<no-reply-nrg@neotural.com>"; 
	    static final String TO = "no-reply-nrg@neotural.com";  // Replace with a "To" address. If your account is still in the 
	    static final String BODY = "This email was sent through the NRG";
	    static final String SUBJECT = "Amazon SES test (SMTP interface accessed using Java)";
	    static final String SMTP_USERNAME = "AKIAXDRZ4XPIH664GX2B";  // Replace with your SMTP username.
	    static final String SMTP_PASSWORD = "BP26NOThtQRr//dCctaS0W0lf1YYYoQlahbYm4dALHwH";  // Replace with your SMTP password.
	    static final String HOST = "email-smtp.us-west-2.amazonaws.com"; 
	    static final int PORT = 25;

	    public synchronized static String sendMail(String toemail,String emailHeader,String content) {
				logger.info("--------------------------------------- Welcome to Email service  -------------------------------");
				logger.info("--------------------------------------- send mail 1 -------------------------------");
				String status = "fail";
		    	Properties props = System.getProperties();
		    	props.put("mail.transport.protocol", "smtps");
		    	props.put("mail.smtp.port", PORT); 
		    	props.put("mail.smtp.auth", "true");
		    	props.put("mail.smtp.starttls.enable", "true");
		    	props.put("mail.smtp.starttls.required", "true");
		    	Session session = Session.getDefaultInstance(props);
		    	try {
					logger.info("--------------------------------------- send mail 2 -------------------------------");
					logger.info("--------------------------------------- send mail 3 -------------------------------");
					MimeMessage msg = new MimeMessage(session);
				
					  msg.setFrom(new InternetAddress("GGL Email  <no-reply-nrg@neotural.com>"));
					  msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toemail));
					  msg.setHeader(emailHeader, emailHeader);
					  msg.setSubject(emailHeader);
						logger.info("--------------------------------------- send mail 4 -------------------------------");
						 // messagebodypart1.setContent(sms.getMsg(),"text/html");
					  BodyPart messagebodypart1 = new MimeBodyPart();
					  messagebodypart1.setContent(content,"text/html");
						logger.info("--------------------------------------- send mail 5 -------------------------------");

						Multipart multipart = new MimeMultipart();				
						multipart.addBodyPart(messagebodypart1);
						msg.setContent(multipart);
						logger.info("--------------------------------------- send mail 6 -------------------------------");

				      Transport transport = session.getTransport();
		            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
		            transport.sendMessage(msg, msg.getAllRecipients());
		    		logger.info("--------------------------------------- send mail 7 -------------------------------");

		            logger.info("----------------------------------- Email sent -------------------------------------");
					status = "success";
					logger.info("--------------------------------------- Thank you see you later bye -------------------------------");

				} 
				catch (MessagingException mex) {
					mex.printStackTrace();
					logger.error("GGL MessagingException ----->"+mex.getMessage());
				}
				catch (Exception e) {
					e.printStackTrace();
					logger.error("GGL Email Exception ----->"+e.getMessage());

				}
				finally
				{
					 session=null;
				}
				return status;
			} 
				
}	





