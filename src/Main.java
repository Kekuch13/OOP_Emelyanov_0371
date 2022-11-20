import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //паттерн Singleton
        Doctor doc1 = Doctor.getInstance(1583,32, "Гиппократов Иван Иванович", "Стоматолог-хирург");
        Doctor doc2 = Doctor.getInstance(7654,47, "Борисов Дмитрий Александрович", "Стоматолог-ортопед");

        System.out.println("doc1.name = " + doc1.getName());
        System.out.println("doc2.name = " +  doc2.getName());

        System.out.println("Изменим имя у doc1 на \"Ахмедов Эльвин Ифратович\"");
        doc2.setName("Ахмедов Эльвин Ифратович");

        System.out.println("doc1.name = " + doc1.getName());
        System.out.println("doc2.name = " + doc2.getName());
        System.out.println("А имя изменилось у объекта doc1 и у doc2");

        //паттерн Builder
        AppointmentBuilder appointmentBuilder = new AppointmentBuilder();

        appointmentBuilder.setID(3592);
        appointmentBuilder.setStart(new Date(1667996100000L));
        appointmentBuilder.setEnd(new Date(1667999700000L));
        System.out.println(appointmentBuilder.getResult());

        appointmentBuilder.setPatientID(8391);
        System.out.println(appointmentBuilder.getResult());

        appointmentBuilder.setDocID(1583);
        System.out.println(appointmentBuilder.getResult());
    }
}