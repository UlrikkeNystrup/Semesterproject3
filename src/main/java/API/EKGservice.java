package API;

import Business.EkgController;
import DataAccessLayer.PatientEkgsDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("ekg")
@Produces(MediaType.APPLICATION_JSON)

public class EKGservice{
    EkgController ekgController = new EkgController();
    @GET
    public List<PatientEkgsDTO> getEkg(){
        return null;
   }
}
