import java.util.Date;

public class AppointmentBuilder {
    private int ID;
    private Date start;
    private Date end;
    private int patientID;
    private int docID;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public Appointment getResult() {
        return new Appointment(ID, start, end, patientID, docID);
    }
}
