package fr.meehome.mail.front.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.meehome.mail.front.domain.Personne;
import fr.meehome.mail.front.services.ListeDiffusionService;

@Path("/listeDiffusionRestService")
public class ListeDiffusionRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Personne> getDefaultCommuneInJSON() {
        ListeDiffusionService service = new ListeDiffusionService();
        return service.getListe();
    }

    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public Personne getDefaultCommuneInJSON(@PathParam("param") String id) {
        ListeDiffusionService service = new ListeDiffusionService();
        return service.find(id);
    }
}
