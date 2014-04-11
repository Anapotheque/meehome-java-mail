package fr.meehome.mail.services.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fr.meehome.mail.services.IDestinatairesService;
import fr.meehome.mail.services.domain.Destinataires;

public class DestinatairesService implements IDestinatairesService {

    @Override
    public List<Destinataires> getListeDestinataires() {
        // TODO - APPEL DAO
        ArrayList<Destinataires> listeDestinataires = new ArrayList<Destinataires>();
        Destinataires destinataires = new Destinataires();
        destinataires.setId("");
        destinataires.setMail("mail@mail.com");
        destinataires.setNom("nom");
        destinataires.setPrenom("prenom");
        listeDestinataires.add(destinataires);
        return listeDestinataires;
    }

    @Override
    public Destinataires getDestinataires(String id) {
        // TODO - APPEL DAO
        return null;
    }

    @Override
    public void setListeDestinataires(List<Destinataires> listDestinataires) {
        // TODO - APPEL DAO
    }

    @Override
    public void setDestinataires(Destinataires destinataires) {
        // TODO - APPEL DAO
    }

    @Override
    public List<Destinataires> importDestinataire(File file) {
        ArrayList<Destinataires> listeDestinataires = new ArrayList<Destinataires>();
        Destinataires destinataires = new Destinataires();
        destinataires.setId("");
        destinataires.setMail("mail@mail.com");
        destinataires.setNom("nom");
        destinataires.setPrenom("prenom");
        listeDestinataires.add(destinataires);
        return listeDestinataires;
    }
}
