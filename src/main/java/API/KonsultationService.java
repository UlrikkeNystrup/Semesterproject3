package API;

import Business.KonsultationsController;
import DataAccessLayer.DTO.KonsultationDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("konsultation")
@Produces(MediaType.APPLICATION_JSON)
@Consumes (MediaType.APPLICATION_JSON)

public class KonsultationService {
    KonsultationsController konsultationsController = new KonsultationsController();
    @GET
    @Path("{cpr}")
    public List<KonsultationDTO> getKonsultation(@PathParam("cpr") String cpr){
        return konsultationsController.hent(cpr);
    }

    @POST
    public void saveKonsultation(KonsultationDTO konsultation)

    {
        konsultationsController.save(konsultation);
    }
}
