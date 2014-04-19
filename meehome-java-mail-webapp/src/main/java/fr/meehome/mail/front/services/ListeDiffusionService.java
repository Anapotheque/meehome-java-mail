package fr.meehome.mail.front.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import fr.meehome.mail.front.domain.Personne;

public class ListeDiffusionService {

    private List<Personne> list;

    public ListeDiffusionService() {
        list = new ArrayList<Personne>();
        list.add(new Personne("1", "RABALLAND", "Romain", "raballand.romain@gmail.com"));
        list.add(new Personne("2", "RABALLAND", "Olivier", "raballand.olivier@gmail.com"));
        list.add(new Personne("3", "RABALLAND", "Dolores", "raballand.dolores@gmail.com"));
    }

    public List<Personne> getListe() {
        return list;
    }

    public Personne find(String id) {
        if (CollectionUtils.isNotEmpty(list)) {
            for (Personne current : list) {
                if (current.getId().equals(id)) {
                    return current;
                }
            }
        }
        return null;
    }

}
