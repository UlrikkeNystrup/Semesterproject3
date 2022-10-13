import java.io.*;

public class JavaSerializer {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("testUser");
        user.setPassWord("testPass");
        writeToFile(user);
        System.out.println("Wrote file");
        System.out.println("Reading file");
        User loadedUser = readFromFile();
        System.out.println(loadedUser);
    }

    private static User readFromFile() {
        try {
            FileInputStream fIn = new FileInputStream("User.obj");
            ObjectInputStream oIn = new ObjectInputStream(fIn);
            Object o = oIn.readObject();
            return (User) o;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void writeToFile(Serializable s){
        try {
            FileOutputStream out = new FileOutputStream("User.obj");
            ObjectOutputStream objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(s);
            objectOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
