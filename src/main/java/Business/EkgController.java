package Business;

import DataAccessLayer.DAO.PatientEkgsDAO;
import DataAccessLayer.DTO.PatientEkgsDTO;

import java.util.List;

public class EkgController {
    PatientEkgsDAO ekgDAO = new PatientEkgsDAO();

    public List<Integer> getEkg() {
        return null;

    }

    public List<PatientEkgsDTO> getEkg(String cpr) {
        return ekgDAO.getEkg(cpr);
    }
}
