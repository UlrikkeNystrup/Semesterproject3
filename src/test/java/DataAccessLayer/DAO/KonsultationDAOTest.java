package DataAccessLayer.DAO;
import DataAccessLayer.DTO.KonsultationDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

class KonsultationDAOTest {
    @Test
    void testGetKonsultation() throws SQLException {
        KonsultationDAO konsultationDAO = new KonsultationDAO();
        System.out.println(konsultationDAO.getKonsultation("0607991234"));
    }

    @Test
    void testSaveKonsultation() throws SQLException {
        KonsultationDAO konsultationDAO2 = new KonsultationDAO();
        KonsultationDTO konsultationDTO = new KonsultationDTO();
        konsultationDTO.setCPR("0607991234");
        konsultationDTO.setKonsultationstype("testType");
        konsultationDTO.setKonsultationsvarighed("TestVarighed");
        konsultationDTO.setDato("2023-01-10");
        konsultationDTO.setTid("10:30:00");
        konsultationDTO.setNotat("test notat");
        konsultationDAO2.saveKonsultation(konsultationDTO);
        System.out.println(konsultationDTO);
    }
}