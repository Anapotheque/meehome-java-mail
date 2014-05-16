package fr.meehome.mail.services.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    private List<Destinataire> populateDaoToService(List<fr.meehome.mail.dao.domain.Destinataire> listDestinataire) {
        List<Destinataire> list = new ArrayList<Destinataire>();
        for (fr.meehome.mail.dao.domain.Destinataire destinataire : listDestinataire) {
            list.add(populateDaoToService(destinataire));
        }
        return list;
    }

    private Destinataire populateDaoToService(fr.meehome.mail.dao.domain.Destinataire destinataire) {
        return mapper.map(destinataire, Destinataire.class);
    }

    private fr.meehome.mail.dao.domain.Destinataire populateServiceToDao(Destinataire destinataire) {
        return mapper.map(destinataire, fr.meehome.mail.dao.domain.Destinataire.class);
    }

    @Override
    public List<Destinataire> findAll() {
        return populateDaoToService(destinataireDao.findAll());
    }

    @Override
    public Destinataire find(Destinataire destinataire) {
        return populateDaoToService(destinataireDao.get(destinataire.getId()));
    }

    @Override
    public boolean add(Destinataire destinataire) {
        return destinataireDao.save(populateServiceToDao(destinataire));
    }

    @Override
    public boolean update(Destinataire destinataire) {
        return destinataireDao.save(populateServiceToDao(destinataire));
    }

    @Override
    public boolean addAll(File file) {
        String line = "";
        String cvsSplitBy = ",";
        BufferedReader br = null;

        boolean result = false;

        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);

                fr.meehome.mail.dao.domain.Destinataire destinataire = new fr.meehome.mail.dao.domain.Destinataire();
                destinataire.setNom(country[0]);
                destinataire.setPrenom(country[1]);
                destinataire.setMail(country[2]);

                result = destinataireDao.save(destinataire);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    @Override
    public boolean delete(Destinataire destinataire) {
        return destinataireDao.remove(populateServiceToDao(destinataire));
    }
}
