package fr.meehome.mail.services;

import java.io.File;

import org.junit.Test;

public class MailSenderTest {

    private final static String LIST_DESTINATAIRES = "raballand.romain@gmail.com, raballand.romain@gmail.com, raballand.romain@gmail.com";

    private final static String EXPEDITEUR = "raballand.romain@gmail.com";

    private final static String OBJET = "Objet du mail";

    private final static String CONTENU = "Contenu du mail";

    private final static File PIECE_JOINTE = new File("C:/Users/Romain/Downloads/Compte.xls");

    @Test
    public void should_send_email_tls() {
        Mail mail = new Mail();
        mail.setListDestinataires(LIST_DESTINATAIRES);
        mail.setExpediteur(EXPEDITEUR);
        mail.setObjet(OBJET);
        mail.setContenu(CONTENU);
        mail.setPieceJointe(PIECE_JOINTE);
        MailSender.sendMailSSL(mail);
    }

    @Test
    public void should_send_email_ssl() {
        Mail mail = new Mail();
        mail.setListDestinataires(LIST_DESTINATAIRES);
        mail.setExpediteur(EXPEDITEUR);
        mail.setObjet(OBJET);
        mail.setContenu(CONTENU);
        mail.setPieceJointe(PIECE_JOINTE);
        MailSender.sendMailSSL(mail);
    }
}
