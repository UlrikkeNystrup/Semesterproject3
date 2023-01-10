package API;

import Business.KonsultationsController;
import DataAccessLayer.DTO.KonsultationDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("konsultation")
@Produces(MediaType.APPLICATION_JSON)

public class KonsultationService {
    KonsultationsController konsultationsController = new KonsultationsController();
    @GET
    public List<KonsultationDTO> getKonsultation(){
        return null;
    }

    @POST
    public List<KonsultationDTO> saveKonsultation(){
        return null;
    }
}
