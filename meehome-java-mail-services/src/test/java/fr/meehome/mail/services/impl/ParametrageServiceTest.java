package fr.meehome.mail.services.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import fr.meehome.mail.dao.IParametrageDao;
import fr.meehome.mail.dao.domain.Parametrage;

@RunWith(MockitoJUnitRunner.class)
public class ParametrageServiceTest {

    @InjectMocks
    private ParametrageService parametrageService;

    @Mock
    private IParametrageDao parametrageDaoMock;

    @Mock
    private Mapper mapperMock;

    @Before
    public void setup() {
        when(parametrageDaoMock.findAll()).thenReturn(populate_parametrage_dao_mock());
    }

    private List<Parametrage> populate_parametrage_dao_mock() {
        List<Parametrage> listParametrage = new ArrayList<Parametrage>();
        Parametrage parametrage = new Parametrage();
        parametrage.setMail("test1");
        parametrage.setPassword("pwd1");
        listParametrage.add(parametrage);
        return listParametrage;
    }

    @Test
    @Ignore
    public void should_return_parametrage() {
        assertEquals("test1", parametrageService.getParametrage().getMail());
        assertEquals("pwd1", parametrageService.getParametrage().getPassword());
    }
}
