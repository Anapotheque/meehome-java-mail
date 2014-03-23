package fr.meehome.mail.services;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailSender {

    /**
     * Email gmail du compte
     */
    private static final String USER_NAME = "raballand.romain@gmail.com";

    /**
     * Devrait etre cryptée
     */
    private static final String PASSWORD = "";

    /**
     * Email d'envoie
     */
    private static final String FROM_EMAIL = "raballand.romain@gmail.com";

    /**
     * Envoie de mail par methode TLS
     * 
     * @param destinataire
     * @param objet
     * @param content
     */
    public static void sendMailTLS(Mail mail) {
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        sendMail(mail, props);
    }

    /**
     * Envoie de mail par methode SSL
     * 
     * @param destinataire
     * @param objet
     * @param content
     */
    public static void sendMailSSL(Mail mail) {
        Properties props = new Properties();
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        sendMail(mail, props);
    }

    /**
     * Methode d'envoie de mail
     * 
     * @param destinataire
     * @param objet
     * @param content
     * @param props
     */
    private static void sendMail(Mail mail, Properties props) {
        try {

            Message message = new MimeMessage(getSessionGmail(props));
            message.setFrom(new InternetAddress(FROM_EMAIL));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail.getListDestinataires()));
            message.setSubject(mail.getObjet());

            // Ajout de la piece jointe
            Multipart multipart = new MimeMultipart();

            // creation partie principale du message
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(mail.getContenu());
            multipart.addBodyPart(messageBodyPart);

            // creation et ajout de la piece jointe
            messageBodyPart = new MimeBodyPart();

            DataSource source = new FileDataSource(mail.getPieceJointe().getPath());
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(mail.getPieceJointe().getName());
            multipart.addBodyPart(messageBodyPart);

            // ajout des éléments au mail

            message.setContent(multipart);

            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Recuperation de la session gmail
     * 
     * @param props
     * @return
     */
    private static Session getSessionGmail(Properties props) {
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USER_NAME, PASSWORD);
            }
        });
        return session;
    }
}
