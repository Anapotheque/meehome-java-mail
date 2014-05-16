package fr.meehome.mail.services.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.meehome.mail.dao.IDestinataireDao;
import fr.meehome.mail.services.IDestinatairesService;
import fr.meehome.mail.services.domain.Destinataire;

@Service
@Transactional
public class DestinatairesService implements IDestinatairesService {

    @Autowired
    private IDestinataireDao destinataireDao;

    @Autowired
    @Qualifier("dozerBeanMapper")
    private Mapper mapper;

    private List<Destinataire> populateUserDto(List<fr.meehome.mail.dao.domain.Destinataire> listDestinataire) {
        List<Destinataire> list = new ArrayList<Destinataire>();
        for (fr.meehome.mail.dao.domain.Destinataire destinataire : listDestinataire) {
            list.add(mapper.map(destinataire, Destinataire.class));
        }
        return list;
    }

    @Override
    public List<Destinataire> findAll() {
        return populateUserDto(destinataireDao.findAll());
    }

    @Override
    public Destinataire find(Destinataire destinataire) {
        return populateUserDto(destinataireDao.search(arg0)(destinataire));
    }

    @Override
    public Destinataire add(Destinataire destinataire) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Destinataire update(Destinataire destinataire) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Destinataire addAll(File file) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Destinataire destinataire) {
        // TODO Auto-generated method stub

    }

}
