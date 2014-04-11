package fr.meehome.mail.services;

import java.io.File;
import java.util.List;

import fr.meehome.mail.services.domain.Destinataires;

public interface IDestinatairesService {

    public List<Destinataires> getListeDestinataires();

    public Destinataires getDestinataires(String id);

    public void setListeDestinataires(List<Destinataires> listDestinataires);

    public void setDestinataires(Destinataires destinataires);

    public List<Destinataires> importDestinataire(File file);

}
