package DataAccessLayer;

import java.sql.*;

public class DatabaseTester {
        public static void main(String[] args){
            try {
                Connection connection = SqlConnection.getConnection();
                //connection.setAutoCommit(false); //overflødig fordi vi kun laver én type forespørgsel
                System.out.println("der er forbindelse");
                Statement statement = connection.createStatement();
                ResultSet show_tables = statement.executeQuery("SELECT * FROM Konsultationer");

                while (show_tables.next()) {
                    System.out.println(show_tables.getString(1));
                    System.out.println(show_tables.getString(2));
                    System.out.println(show_tables.getString(3));
                    System.out.println(show_tables.getString(4));
                    System.out.println(show_tables.getString(5));
                    System.out.println(show_tables.getString(6));
                }

            } catch(
                    SQLException e)

            {
                e.printStackTrace();
            }
        }


}
