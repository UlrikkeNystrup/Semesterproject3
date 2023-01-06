package DataAccessLayer;

import java.sql.Timestamp;

public class EkgDTO {

    private String cpr;
    private Timestamp tid;
    private double spænding;

    public String getCpr() {
        return cpr;
    }
    public Timestamp getTid() {
        return tid;
    }
    public double getSpænding() {
        return spænding;
    }
    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
    public void setTid(Timestamp tid) {
        this.tid = tid;
    }
    public void setSpænding(double spænding) {
        this.spænding = spænding;
    }

    public String toString(){
        return "EkgDTO{"+
                "cpr='"+cpr + '\'+

    }
}
