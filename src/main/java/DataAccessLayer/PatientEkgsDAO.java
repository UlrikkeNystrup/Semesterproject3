package DataAccessLayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientEkgsDAO {
    public List<PatientEkgsDTO> getEkg(String cpr) throws SQLException {
        List<PatientEkgsDTO> data = new ArrayList<>();
        Connection connection = SqlConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Samples, PatientEkgs WHERE Samples.ekg_id=PatientEkgs.id AND PatientEkgs.cpr =?");
            preparedStatement.setString(1,cpr);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                PatientEkgsDTO patientEkgsDTO = new PatientEkgsDTO();
                patientEkgsDTO.setCpr(resultSet.getString("cpr"));
                patientEkgsDTO.setId(resultSet.getString("id"));
                patientEkgsDTO.setStartTime(resultSet.getTimestamp("startTime"));
                data.add(patientEkgsDTO);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } return data;
    }
}
