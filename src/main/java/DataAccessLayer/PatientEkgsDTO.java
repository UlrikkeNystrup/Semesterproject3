package DataAccessLayer;

import java.sql.Timestamp;

public class PatientEkgsDTO {
    //databærende klasse, svarer til tabellen EKG
    private String cpr;
    private String id;
    private Timestamp startTime;

    @Override
    public String toString() {
        return "PatientEkgsDTO{" +
                "cpr='" + cpr + '\'' +
                ", id='" + id + '\'' +
                ", startTime=" + startTime +
                '}';
    }

    public String getCpr() {
        return cpr;
    }

    public String getId() {
        return id;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }
}

