//bruges ikke til noget, kan derfor slettes

/*
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XMLSerializer {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setKonsutationsDato("testDato");
        user.setKonsutationsTid("testTid");
        XmlMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String xmlString = mapper.writeValueAsString(user);
        System.out.println(xmlString);
        mapper.writeValue(new File("User.xml"),user);

        User userFromXML = mapper.readValue(new File("User.xml"), User.class);
        System.out.println("Read from XML: ");
        System.out.println(userFromXML);

    }
}
*/