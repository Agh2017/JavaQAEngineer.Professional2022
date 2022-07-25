package data;

public class Schoolboy {

    private  int id;
    private String name;
    private int grade;
    private String schoolName;
    private String city;

    public Schoolboy(int id, String name, int iq, String schoolName, String city) {
        this.id = id;
        this.name = name;
        this.grade = iq;
        this.schoolName = schoolName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIq() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIq(int iq) {
        this.grade = iq;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{"
                + "\"id\":" + id + ","
                + "\"name\":" + "\"" + name + "\"" + "," +
                "\"grade\":" + "\"" + grade + "\"" + "," +
                "\"schoolName\":" + "\"" + schoolName + "\"" + "," +
                "\"city\":" + "\"" + city + "\"" +
                '}';
    }
}
