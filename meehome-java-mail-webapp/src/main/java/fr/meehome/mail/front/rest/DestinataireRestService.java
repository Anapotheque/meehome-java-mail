package fr.meehome.mail.front.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import fr.meehome.mail.front.domain.Destinataire;
import fr.meehome.mail.front.services.DestinataireService;
import fr.meehome.mail.front.services.IDestinataireService;

@Path("/destinataireRestService")
public class DestinataireRestService {

    @Autowired
    private IDestinataireService destinataireService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Destinataire> getAllDestinatairesInJSON() {
        destinataireService = (IDestinataireService ) new DestinataireService();
        return destinataireService.getAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Destinataire getById(@PathParam("id")
    int id) {
        destinataireService = (IDestinataireService ) new DestinataireService();
        return destinataireService.find(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Destinataire create(Destinataire destinataire) {
        destinataireService = (IDestinataireService ) new DestinataireService();
        return destinataireService.create(destinataire);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Destinataire update(Destinataire destinataire) {
        destinataireService = (IDestinataireService ) new DestinataireService();
        return destinataireService.update(destinataire);
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void remove(@PathParam("id")
    int id) {
        destinataireService = (IDestinataireService ) new DestinataireService();
        destinataireService.remove(id);
    }
}
