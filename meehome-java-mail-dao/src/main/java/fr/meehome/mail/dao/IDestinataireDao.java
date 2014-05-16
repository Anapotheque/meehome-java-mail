package fr.meehome.mail.dao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

import fr.meehome.mail.dao.domain.Destinataire;

public interface IDestinataireDao extends GenericDAO<Destinataire, Long> {

    public Destinataire get(int id);

}
