package DataAccessLayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EkgDAO {
    public List<EkgDTO> getEkg(Timestamp tid) throws SQLException {
        List<EkgDTO> data = new ArrayList<>();
        Connection connection = SqlConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM EKG WHERE time > ? ");
            preparedStatement.setTimestamp(2,tid);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                EkgDTO ekgDTO = new EkgDTO();
                ekgDTO.setCpr(resultSet.getString("cpr"));
                ekgDTO.setTid(resultSet.getTimestamp("tid"));
                ekgDTO.setSpænding(resultSet.getDouble("spænding"));
                data.add(ekgDTO);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } return data;
    }
}
