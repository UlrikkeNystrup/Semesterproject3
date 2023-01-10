package DataAccessLayer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//vores klasse der skaber forbindelse til databasen
public class SqlConnection {
    //Create a Connection object
    private static Connection connection;

    //Create a Connection method
    public static Connection getConnection(){
        /* metode typen er Connection, dermed skal metoden returnere et connection objekt (ligesom hvis det var en int eller double)
        klassemetode, derfor man bruger nøgleordet Static
        --> man bruger nøgleordet Static, fordi det er en klassemetode.
        Man opretter et Connection objekt inde i den klasse hvor man vil bruge forbindelsen (RegistrerKonsServlet), og så kalder man getConnection() metoden på det.
         */
        try {
            if (connection==null || connection.isClosed()) {
                connection = DriverManager.getConnection("jdbc:mysql://db.caprover.diplomportal.dk/s215849?"
                        + "user=s215849&password=VZQM7OAP0CnLXTZ4rqYgw");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

