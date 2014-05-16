package fr.meehome.mail.dao.impl;

import org.springframework.stereotype.Repository;

import fr.meehome.mail.dao.IParametrageDao;
import fr.meehome.mail.dao.domain.Parametrage;

@Repository
public class ParametrageDao extends SessionFactoryDao<Parametrage, Long> implements IParametrageDao {

}
