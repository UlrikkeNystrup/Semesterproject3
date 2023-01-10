package DataAccessLayer.DAO;
import DataAccessLayer.DAO.PatientEkgsDAO;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;

public class PatientEkgsDAOTest {
    @Test
    void testGetEkg() throws SQLException {
        PatientEkgsDAO ekgDaoTest = new PatientEkgsDAO();
        System.out.println(ekgDaoTest.getEkg("1110109996"));
    }
}
