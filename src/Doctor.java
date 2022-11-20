public class Doctor {
    private int ID;
    private int age;
    private String name;
    private String speciality;
    private static Doctor instance;

    private Doctor(int ID, int age, String name, String speciality) {
        this.ID = ID;
        this.age = age;
        this.name = name;
        this.speciality = speciality;
    }

    public static Doctor getInstance(int ID, int age, String name, String speciality) {
        if(instance == null) {
            instance = new Doctor(ID, age, name, speciality);
        }
        return instance;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
