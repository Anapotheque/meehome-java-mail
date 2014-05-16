package fr.meehome.mail.dao.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.excilys.ebi.spring.dbunit.test.DataSet;
import com.excilys.ebi.spring.dbunit.test.DataSetTestExecutionListener;

import fr.meehome.mail.dao.IDestinataireDao;
import fr.meehome.mail.dao.domain.Destinataire;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/fr/meehome/mail/dao/applicationContext-test.xml" })
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, DataSetTestExecutionListener.class })
@DataSet(value = "DestinataireDao.xml")
public class DestinataireDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private IDestinataireDao destinataireDao;

    @Test
    public void should_return_all() {
        List<Destinataire> listDestinataire = destinataireDao.findAll();
        assertEquals(2, listDestinataire.size());
    }

    @Test
    public void should_return_one() {
        List<Destinataire> listDestinataire = destinataireDao.findAll();
        Destinataire destinataire = destinataireDao.get(listDestinataire.get(0).getId());
        assertEquals("NOM1", destinataire.getNom());
    }

    @Test
    public void should_return_create_one() {
        Destinataire destinataire = new Destinataire();
        destinataire.setNom("NOM3");
        destinataire.setPrenom("PRENOM3");
        destinataire.setMail("MAIL3");
        assertEquals(true, destinataireDao.save(destinataire));
    }

    @Test
    public void should_return_delete_one() {
        List<Destinataire> listDestinataire = destinataireDao.findAll();
        Destinataire destinataire = destinataireDao.get(listDestinataire.get(2).getId());
        assertEquals(true, destinataireDao.remove(destinataire));
    }

}
