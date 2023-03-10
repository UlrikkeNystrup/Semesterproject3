package DataAccessLayer.DAO;

import DataAccessLayer.DTO.KonsultationDTO;
import DataAccessLayer.SqlConnection;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KonsultationDAO {
    public List<KonsultationDTO> getKonsultation(String cpr) {
        List<KonsultationDTO> data = new ArrayList<>();
        Connection connection = SqlConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Konsultationer WHERE CPR =?");
            preparedStatement.setString(1, cpr);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                KonsultationDTO konsultationDTO = new KonsultationDTO();
                konsultationDTO.setCPR(resultSet.getString("CPR"));
                konsultationDTO.setDato(resultSet.getString("Dato"));
                konsultationDTO.setTid(resultSet.getString("Tid"));
                konsultationDTO.setKonsultationstype(resultSet.getString("Konsultationstype"));
                konsultationDTO.setKonsultationsvarighed(resultSet.getString("Konsultationsvarighed"));
                konsultationDTO.setNotat(resultSet.getString("Notat"));
                data.add(konsultationDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    //første bud på saveKonsultation() metode
    /* public void saveKonsultation(List<KonsultationDTO> konsultationDtoList) {
        try{
            Connection connection = SqlConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Konsultationer(CPR,Dato, Tid, Konsultationstype, Konsultationsvarighed, Notat) VALUES(?,?,?,?,?,?)");
            for(KonsultationDTO konsultationDTO: konsultationDtoList){
                preparedStatement.setString(1, konsultationDTO.getCPR());
                preparedStatement.setString(2, konsultationDTO.getDato());
                preparedStatement.setString(3, konsultationDTO.getTid());
                preparedStatement.setString(4, konsultationDTO.getKonsultationstype());
                preparedStatement.setString(5, konsultationDTO.getKonsultationsvarighed());
                preparedStatement.setString(6, konsultationDTO.getNotat());
                preparedStatement.addBatch();
            }preparedStatement.executeBatch();
        }catch (SQLException e) {
            e.printStackTrace();
        }
     }*/

    //andet bud på saveKonsultation() metode
    public void saveKonsultation(KonsultationDTO konsultationDTO) {
        try {

            Connection connection = SqlConnection.getConnection();
            System.out.println("der er forbindelse til databasen");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Konsultationer(CPR,Dato, Tid, Konsultationstype, Konsultationsvarighed, Notat) VALUES(?,?,?,?,?,?)");
            preparedStatement.setString(1, konsultationDTO.getCPR());
            preparedStatement.setString(2, konsultationDTO.getDato());
            preparedStatement.setString(3, konsultationDTO.getTid());
            preparedStatement.setString(4, konsultationDTO.getKonsultationstype());
            preparedStatement.setString(5, konsultationDTO.getKonsultationsvarighed());
            preparedStatement.setString(6, konsultationDTO.getNotat());
            preparedStatement.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
