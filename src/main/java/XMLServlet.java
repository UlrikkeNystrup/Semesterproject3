import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

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
    }

    @Override
/*
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = mapper.readValue(req.getInputStream(), User.class);
        System.out.println(user);
        resp.getWriter().write("Tak for brugeren: " + user);

        }

*/
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.toLowerCase().equals("hans") && password.equals("Secret")) {
            resp.addCookie(new Cookie("session", username));
            PrintWriter writer = resp.getWriter();
            resp.sendRedirect("HomePage.html");
            //writer.print("congrats, " + username + ", you got in ");
            writer.close();
        } else {
            resp.sendRedirect("index.html");

        }


    }}
