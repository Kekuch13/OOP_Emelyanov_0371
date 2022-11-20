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

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public int getPatientID() {
        return patientID;
    }

    public int getDocID() {
        return docID;
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
