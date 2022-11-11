package Business;

import Data.SqlConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterKonsServlet",urlPatterns = "/register")
public class RegisterKonsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        //sætter content type
        resp.setContentType("text/html");
        //henter værdier fra opret ny konsultation formen
        String CPR = req.getParameter("cprnummer");
        String dato =req.getParameter("datonummer");
        String tid = req.getParameter("klokkeslet");
        String type = req.getParameter("type");//ville gerne bare have value:1,2,3, ved ikke helt hvad der sker nu
        String varighed =  req.getParameter("varighed");//ville gerne bare have value:1,2,3, ved ikke helt hvad der sker nu
        String notat = req.getParameter("notat");

        //System.out.println("cpr: "+ CPR +" Dato: "  +dato+" Tid: "+ tid+ " Type: "+ type+ " Varighed: "+ varighed + " notat: " + notat);
        try {
            Connection connection= SqlConnection.getConnection();
            //connection.setAutoCommit(false); //overflødig fordi vi kun laver én type forespørgsel

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Konsultation (CPR, Dato, Tid, Konsultationstype, Konsultationsvarighed, Notat) VALUES (?,?,?,?,?,?)");
            //System.out.println(ptDto.getPatientId());
            preparedStatement.setString(1, CPR);
            preparedStatement.setString(2, dato);
            preparedStatement.setString(3, tid);
            preparedStatement.setString(4, type);
            preparedStatement.setString(5, varighed);
            preparedStatement.setString(6, notat);
            preparedStatement.execute();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        //lukker streamen
        pw.close();

        //resp.sendRedirect("index.html");








    }


}
