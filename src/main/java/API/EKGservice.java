package API;

import Business.EkgController;
import DataAccessLayer.EkgDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@Path("ekg")
@Produces(MediaType.APPLICATION_JSON)

public class EKGservice {
    EkgController ekgController = new EkgController();
    @GET
    public List<EkgDTO> getEkg(){
        return ekgController.getEkg();
    }
}
