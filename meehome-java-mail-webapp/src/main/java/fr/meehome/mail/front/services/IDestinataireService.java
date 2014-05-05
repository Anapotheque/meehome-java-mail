package fr.meehome.mail.front.services;

import java.util.List;

import fr.meehome.mail.front.domain.Destinataire;

public interface IDestinataireService {

    public List<Destinataire> getAll();

    public Destinataire find(int id);

    public Destinataire create(Destinataire destinataire);

    public Destinataire update(Destinataire destinataire);

    public void remove(int id);

}
