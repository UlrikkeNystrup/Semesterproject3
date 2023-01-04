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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = new User();
        user.setKonsutationsDato("Test dato");
        user.setKonsutationsTid("Test tid");
        String xmlString = mapper.writeValueAsString(user);
        PrintWriter writer = resp.getWriter();
        writer.write(xmlString);
        writer.flush();

/*
        User user2 = new User();
        user2.setKonsutationsDato();
        user2.setKonsutationsTid("testTid");
        writeToFile(user);
*/

    }


/*
  @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = mapper.readValue(req.getInputStream(), User.class);
        System.out.println(user);
        resp.getWriter().write("Tak for brugeren: " + user);

        }

*/
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //hashpw metode som ligger i Bcrypt klassen lagrer noget i hashed-Strengen
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());

        if (username.toLowerCase().equals("hans") && BCrypt.checkpw(password, hashed)) {
            resp.addCookie(new Cookie("session", username));
            //PrintWriter writer = resp.getWriter();
            resp.sendRedirect("NewHomePage.html");
            //writer.print("congrats, " + username + ", you got in ");
           // writer.close();
        }
        else if(username.equals("Ole") && password.equals("hallo")) {
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
