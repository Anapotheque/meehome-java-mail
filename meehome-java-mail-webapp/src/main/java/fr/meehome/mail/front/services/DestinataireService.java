package fr.meehome.mail.front.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.meehome.mail.front.domain.Destinataire;

@Service
public class DestinataireService implements IDestinataireService {

    private List<Destinataire> list;

    public DestinataireService() {

        list = new ArrayList<Destinataire>();

        Destinataire romain = new Destinataire();
        romain.setId(0);
        romain.setNom("RABALLAND");
        romain.setPrenom("Romain");
        romain.setMail("raballand.romain@gmail.com");

        Destinataire dolores = new Destinataire();
        dolores.setId(1);
        dolores.setNom("RABALLAND");
        dolores.setPrenom("Dolores");
        dolores.setMail("raballand.dolores@gmail.com");

        Destinataire olivier = new Destinataire();
        olivier.setId(2);
        olivier.setNom("RABALLAND");
        olivier.setPrenom("Olivier");
        olivier.setMail("raballand.olivier@gmail.com");

        list.add(romain);
        list.add(olivier);
        list.add(dolores);
    }

    public List<Destinataire> getAll() {
        return list;
    }

    @Override
    public Destinataire find(int id) {
        for (Destinataire current : list) {
            if (current.getId() == id) {
                return current;
            }
        }
        return null;
    }

    @Override
    public Destinataire create(Destinataire destinataire) {
        list.add(destinataire);
        System.out.println("CREATION DESTINATAIRE : " + destinataire.getNom() + " - " + destinataire.getPrenom());
        return null;
    }

    @Override
    public Destinataire update(Destinataire destinataire) {
        System.out.println("MISE A JOUR DESTINATAIRE" + destinataire.getNom() + " - " + destinataire.getPrenom());
        return null;
    }

    @Override
    public void remove(int id) {
        Destinataire destinataire = find(id);
        System.out.println("DESTRUCTION DESTINATAIRE" + destinataire.getNom() + " - " + destinataire.getPrenom());
    }

}
