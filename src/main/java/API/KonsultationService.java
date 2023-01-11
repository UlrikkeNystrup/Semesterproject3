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
    public KonsultationDTO getKonsultation(){
        return new KonsultationDTO();
    }

    @POST
    public void saveKonsultation(KonsultationDTO konsultation)

    {
        konsultationsController.save(konsultation);
    }
}
