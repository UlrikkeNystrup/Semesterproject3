import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.servlet.annotation.WebServlet;
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
        user.setPassWord("Test Pass");
        user.setUserName("Test User");
        String xmlString = mapper.writeValueAsString(user);
        PrintWriter writer = resp.getWriter();
        writer.write(xmlString);
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user = mapper.readValue(req.getInputStream(), User.class);
        System.out.println(user);
        resp.getWriter().write("Tak for brugeren: " + user);

    }
}
