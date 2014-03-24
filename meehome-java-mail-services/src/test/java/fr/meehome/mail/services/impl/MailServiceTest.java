package fr.meehome.mail.services.impl;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dumbster.smtp.SimpleSmtpServer;
import com.dumbster.smtp.SmtpMessage;

import fr.meehome.mail.services.Mail;

public class MailServiceTest {

    private final static String LIST_DESTINATAIRES = "raballand.romain@gmail.com";

    private final static String EXPEDITEUR = "raballand.romain@gmail.com";

    private final static String OBJET = "Objet du mail";

    private final static String CONTENU = "Contenu du mail";

    private MailService mailService = new MailService();

    private SimpleSmtpServer server;

    @Before
    public void startServer() {
        server = SimpleSmtpServer.start();
    }

    @Test
    public void should_send_email() {
        Mail mail = new Mail();
        mail.setListDestinataires(LIST_DESTINATAIRES);
        mail.setExpediteur(EXPEDITEUR);
        mail.setObjet(OBJET);
        mail.setContenu(CONTENU);

        try {
            mailService.sendMail(mail);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(1, server.getReceivedEmailSize());
        SmtpMessage email = (SmtpMessage ) server.getReceivedEmail().next();
        assertEquals(mail.getObjet(), email.getHeaderValue("Subject"));
        assertEquals(true, email.getBody().contains(mail.getContenu()));
    }

    @After
    public void stopServer() {
        server.stop();
    }
}
