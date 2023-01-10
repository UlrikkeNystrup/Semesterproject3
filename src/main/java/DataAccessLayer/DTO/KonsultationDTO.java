package DataAccessLayer.DTO;

public class KonsultationDTO {
    private String CPR;
    private String Dato;
    private String Tid;
    private String Konsultationstype;
    private String Konsultationsvarighed;
    private String Notat;

    @Override
    public String toString() {
        return "KonsultationDTO{" +
                "CPR='" + CPR + '\'' +
                ", Dato='" + Dato + '\'' +
                ", Tid='" + Tid + '\'' +
                ", Konsultationstype='" + Konsultationstype + '\'' +
                ", Konsultationsvarighed='" + Konsultationsvarighed + '\'' +
                ", Notat='" + Notat + '\'' +
                '}';
    }

    public String getCPR() {
        return CPR;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String dato) {
        Dato = dato;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String tid) {
        Tid = tid;
    }

    public String getKonsultationstype() {
        return Konsultationstype;
    }

    public void setKonsultationstype(String konsultationstype) {
        Konsultationstype = konsultationstype;
    }

    public String getKonsultationsvarighed() {
        return Konsultationsvarighed;
    }

    public void setKonsultationsvarighed(String konsultationsvarighed) {
        Konsultationsvarighed = konsultationsvarighed;
    }

    public String getNotat() {
        return Notat;
    }

    public void setNotat(String notat) {
        Notat = notat;
    }
}
