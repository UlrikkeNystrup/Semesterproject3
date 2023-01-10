package DataAccessLayer.DTO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PatientEkgsDTO {
    //databærende klasse, svarer til tabellen EKG
    private String cpr;
    private String id;
    private Timestamp startTime;
    private List<List<Double>> samples = new ArrayList<>();

    public List<List<Double>> getSamples() {
        return samples;
    }

    public void setSamples(List<List<Double>> samples) {
        this.samples = samples;
    }

    @Override
    public String toString() {
        return "PatientEkgsDTO{" +
                "cpr='" + cpr + '\'' +
                ", id='" + id + '\'' +
                ", startTime=" + startTime +
                ", samples=" + samples +
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

