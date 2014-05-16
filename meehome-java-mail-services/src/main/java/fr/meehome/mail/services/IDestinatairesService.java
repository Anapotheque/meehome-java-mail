package fr.meehome.mail.services;

import java.io.File;
import java.util.List;

import fr.meehome.mail.services.domain.Destinataire;

public interface IDestinatairesService {

    public List<Destinataire> findAll();

    public Destinataire find(Destinataire destinataire);

    public boolean add(Destinataire destinataire);

    public boolean update(Destinataire destinataire);

    public boolean addAll(File file);

    public boolean delete(Destinataire destinataire);

}
