package DataAccessLayer.DAO;

import DataAccessLayer.DTO.PatientEkgsDTO;
import DataAccessLayer.SqlConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientEkgsDAO {
    public List<PatientEkgsDTO> getEkg(String cpr){
        List<PatientEkgsDTO> data = new ArrayList<>();
        Connection connection = SqlConnection.getConnection();
        try {
            PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM PatientEkgs WHERE PatientEkgs.cpr =?");
            preparedStatement1.setString(1,cpr);
            ResultSet resultSet1 = preparedStatement1.executeQuery();
            while(resultSet1.next()) {
                PatientEkgsDTO patientEkgsDTO = new PatientEkgsDTO();
                patientEkgsDTO.setCpr(resultSet1.getString("cpr"));
                patientEkgsDTO.setId(resultSet1.getString("id"));
                patientEkgsDTO.setStartTime(resultSet1.getTimestamp("startTime"));

                data.add(patientEkgsDTO);
                PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT * FROM Samples WHERE ekg_id =?");
                preparedStatement2.setString(1,patientEkgsDTO.getId());
                ResultSet resultSet2 = preparedStatement2.executeQuery();
                while(resultSet2.next()) {
                    List<List<Double>> samples = patientEkgsDTO.getSamples();
                    List<Double> doubles = new ArrayList<>();
                    doubles.add(resultSet2.getDouble("tid"));
                    doubles.add(resultSet2.getDouble("spænding"));
                    samples.add(doubles);
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } return data;
    }
}
