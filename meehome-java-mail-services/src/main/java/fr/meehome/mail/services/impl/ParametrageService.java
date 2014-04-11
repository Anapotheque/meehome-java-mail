package fr.meehome.mail.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.meehome.mail.dao.IParametrageDao;
import fr.meehome.mail.services.IParametrageService;
import fr.meehome.mail.services.domain.Parametrage;

@Service
@Transactional
public class ParametrageService implements IParametrageService {

    @Autowired
    private IParametrageDao parametrageDao;

    @Autowired
    @Qualifier("dozerBeanMapper")
    private Mapper mapper;

    public Parametrage getParametrage() {
        List<Parametrage> listParametrage = new ArrayList<Parametrage>();
        for (fr.meehome.mail.dao.domain.Parametrage parametrage : parametrageDao.findAll()) {
            listParametrage.add(mapper.map(parametrage, Parametrage.class));
        }
        return listParametrage.get(0);
    }

    public void setParametrage(Parametrage parametrage) {
        // TODO - Apl DAO
    }

}
