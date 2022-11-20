import java.util.Date;

public class Appointment {
    private int ID;
    private Date start;
    private Date end;
    private int patientID;
    private int docID;

    public Appointment(int ID, Date start, Date end, int patientID, int docID) {
        this.ID = ID;
        this.start = start;
        this.end = end;
        this.patientID = patientID;
        this.docID = docID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int patientId) {
        this.docID = docID;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "ID=" + ID +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", patientID=" + patientID +
                ", docID=" + docID +
                '}';
    }
}
