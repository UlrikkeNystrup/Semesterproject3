package Business;
import org.mindrot.jbcrypt.BCrypt;

//klasse til at hashe kodeord
public class PasswordCrypt {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {


            String hashed = BCrypt.hashpw("Secret", BCrypt.gensalt());
            System.out.println(hashed);}
        }
    }
