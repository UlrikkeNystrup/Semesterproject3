package Business;

import DataAccessLayer.EkgDAO;

import java.sql.Timestamp;
import java.util.List;

public class EkgController {
    EkgDAO ekgDAO = new EkgDAO();

    public List<Integer> getEkg() {
        return ekgDAO.getEkg();

    }
}
