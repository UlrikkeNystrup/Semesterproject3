package API;

import Business.EkgController;
import DataAccessLayer.DTO.PatientEkgsDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("ekg")
@Produces(MediaType.APPLICATION_JSON)

public class EKGservice{
    EkgController ekgController = new EkgController();


    @GET
    @Path("{cpr}")
    public List<PatientEkgsDTO> getEkg(@PathParam("cpr") String cpr){
        return ekgController.getEkg(cpr);
   }
}
