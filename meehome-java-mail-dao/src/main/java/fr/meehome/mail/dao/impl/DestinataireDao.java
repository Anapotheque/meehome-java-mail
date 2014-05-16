package fr.meehome.mail.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.googlecode.genericdao.search.Search;

import fr.meehome.mail.dao.IDestinataireDao;
import fr.meehome.mail.dao.domain.Destinataire;

@Repository
public class DestinataireDao extends SessionFactoryDao<Destinataire, Long> implements IDestinataireDao {

    @Override
    public Destinataire get(int id) {
        List<Destinataire> listDestinataire = search(new Search().addFilterEqual("id", String.valueOf(id)));
        if (listDestinataire != null && !listDestinataire.isEmpty()) {
            return listDestinataire.get(0);
        }
        return null;
    }
}
