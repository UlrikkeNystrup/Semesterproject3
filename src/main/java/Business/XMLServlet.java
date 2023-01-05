package Business;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;
import java.io.*;

@WebServlet(name = "XMLServlet",urlPatterns = "/api")
public class XMLServlet extends HttpServlet {
    XmlMapper mapper = new XmlMapper();
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //hashpw metode som ligger i Bcrypt klassen lagrer noget i hashed-Strengen
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());

        if (username.toLowerCase().equals("hanslæge") && password.equals("Secret")) {
            resp.addCookie(new Cookie("session", username));
            //PrintWriter writer = resp.getWriter();
            resp.sendRedirect("NewHomePage.html");
            //writer.print("congrats, " + username + ", you got in ");
           // writer.close();
        }
        else if(username.equals("Olepatient") && password.equals("hallo")) {
            resp.addCookie(new Cookie("session", username));
           // PrintWriter writer = resp.getWriter();
            resp.sendRedirect("PatientHomePage.html");
            //writer.print("congrats, " + username + ", you got in ");
          //  writer.close();
            }
        else {
            resp.sendRedirect("index.html");

        }


    }

    /* udkommenteret
    private static void writeToFile(Serializable s){
        try {
            FileOutputStream out = new FileOutputStream("User.obj");
            ObjectOutputStream objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(s);
            objectOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
