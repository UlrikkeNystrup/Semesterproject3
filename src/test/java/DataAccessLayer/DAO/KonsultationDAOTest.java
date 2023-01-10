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
        System.out.println(konsultationDAO.getKonsultation("140892-0234"));
    }

    @Test
    void testSaveKonsultation() throws SQLException {
        KonsultationDAO konsultationDAO2 = new KonsultationDAO();
        System.out.println(konsultationDAO2.saveKonsultation(??));
        //ved ikke hvad der skal stå som parameter i saveKonsultation() kaldet
    }
}