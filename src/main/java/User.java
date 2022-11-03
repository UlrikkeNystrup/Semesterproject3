import java.io.Serializable;

public class User implements Serializable {

    private String konsutationsDato;
    private String konsutationsTid;

    @Override
    public String toString() {
        return "Nykons{" +
                "konsutationsDato='" + konsutationsDato + '\'' +
                ", konsutationsTid='" + konsutationsTid + '\'' +
                '}';
    }

    public String getKonsutationsDato() {
        return konsutationsDato;
    }

    public void setKonsutationsDato(String konsutationsDato) {
        this.konsutationsDato = konsutationsDato;
    }

    public String getKonsutationsTid() {
        return konsutationsTid;
    }

    public void setKonsutationsTid(String konsutationsTid) {
        this.konsutationsTid = konsutationsTid;
    }
}
