package Business;

import DataAccessLayer.DAO.KonsultationDAO;
import DataAccessLayer.DTO.KonsultationDTO;

import java.util.List;

public class KonsultationsController {
    KonsultationDAO konsultationDAO = new KonsultationDAO();

    public void save(KonsultationDTO konsultation) {
        konsultationDAO.saveKonsultation(konsultation);
    }

    public List<KonsultationDTO> hent(String cpr) {
       return konsultationDAO.getKonsultation(cpr);
    }
}
