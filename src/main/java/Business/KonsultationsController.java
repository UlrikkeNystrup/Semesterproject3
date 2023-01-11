package Business;

import DataAccessLayer.DAO.KonsultationDAO;
import DataAccessLayer.DTO.KonsultationDTO;

import java.util.List;

public class KonsultationsController {
    KonsultationDAO konsultationDAO = new KonsultationDAO();
    public List<Integer> getKonsultation() {
        return null;

    }

    public void save(KonsultationDTO konsultation) {
        konsultationDAO.saveKonsultation(konsultation);
    }
}
