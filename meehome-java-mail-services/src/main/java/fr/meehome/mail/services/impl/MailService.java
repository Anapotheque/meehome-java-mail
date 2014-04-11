package fr.meehome.mail.services.impl;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import fr.meehome.mail.services.IMailService;
import fr.meehome.mail.services.Util;
import fr.meehome.mail.services.domain.Mail;

public class MailService implements IMailService {

    /**
     * Permet l'envoie d'un mail
     * 
     * @param mail
     */
    @Override
    public void sendMail(Mail mail) {
        try {

            Message message = new MimeMessage(Util.getSession());
            message.setFrom(new InternetAddress(Util.getMailProperties("mail.from")));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mail.getListDestinataires()));
            message.setSubject(mail.getObjet());

            if (mail.getPieceJointe() != null) {
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
            } else {
                message.setText(mail.getContenu());
            }

            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
