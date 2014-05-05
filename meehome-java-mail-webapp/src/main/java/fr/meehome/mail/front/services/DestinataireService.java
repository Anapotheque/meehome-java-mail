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
        romain.setNom("RABALLAND");
        romain.setNom("v");
        romain.setNom("raballand.romain@gmail.com");

        Destinataire dolores = new Destinataire();
        dolores.setNom("RABALLAND");
        dolores.setNom("Dolores");
        dolores.setNom("raballand.dolores@gmail.com");

        Destinataire olivier = new Destinataire();
        olivier.setNom("RABALLAND");
        olivier.setNom("Olivier");
        olivier.setNom("raballand.olivier@gmail.com");

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
        System.out.println("CREATION DESTINATAIRE");
        return null;
    }

    @Override
    public Destinataire update(Destinataire destinataire) {
        System.out.println("MISE A JOUR DESTINATAIRE");
        return null;
    }

    @Override
    public void remove(int id) {
        System.out.println("CREATION DESTINATAIRE");
    }

}
