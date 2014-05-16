package fr.meehome.mail.services;

import java.io.File;
import java.util.List;

import fr.meehome.mail.services.domain.Destinataire;

public interface IDestinatairesService {

    public List<Destinataire> findAll();

    public Destinataire find(Destinataire destinataire);

    public Destinataire add(Destinataire destinataire);

    public Destinataire update(Destinataire destinataire);

    public Destinataire addAll(File file);

    public void delete(Destinataire destinataire);

}
