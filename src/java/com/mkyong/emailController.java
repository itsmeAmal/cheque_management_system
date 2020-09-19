package com.mkyong;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class emailController {

    private static String ToEmailFromRegUi = "";

    public emailController(String ToEmail) {
        emailController.ToEmailFromRegUi = ToEmail;
        
            final String username = "wickramarathna.amal@gmail.com";
        final String password = "opgkslszguonxkon";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(ToEmailFromRegUi));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("digitalhome223344@gmail.com")
            );
            message.setSubject("Smart House");
            message.setText("You are registered successfully !");

            Transport.send(message);

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
