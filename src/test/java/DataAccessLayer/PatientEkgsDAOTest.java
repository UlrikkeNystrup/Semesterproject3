package DataAccessLayer;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class PatientEkgsDAOTest {
    @Test
    void testGetEkg() throws SQLException {
        PatientEkgsDAO ekgDaoTest = new PatientEkgsDAO();
        System.out.println(ekgDaoTest.getEkg("1110109996"));
    }
}
