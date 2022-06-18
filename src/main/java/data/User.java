package data;

public class User {

    private String name;
    private String course;
    private String email;

    private int age;
    private int scope;

    public User(String name, String course, String email, int age, int scope) {
        this.name = name;
        this.course = course;
        this.email = email;
        this.age = age;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getScope() {
        return scope;
    }

    @Override
    public String toString() {
        return "{ " +
                "name:\"" + name + '\"' +
                ", course:\"" + course + '\"' +
                ", email:\"" + email + '\"' +
                ", age:\"" + age + "\"" +
                " }";
    }
}
