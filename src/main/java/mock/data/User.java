package mock.data;

public class User {

  private String name;
  private String course;
  private String email;

  private int age;
  private int scope;
  private String id;

  public User(String name, String course, String email, int age, int scope) {
    this.name = name;
    this.course = course;
    this.email = email;
    this.age = age;
    this.scope = scope;
  }

  public User(String name, int scope, String id) {
    this.name = name;
    this.scope = scope;
    this.id = id;
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

  public String getId() {
    return id;
  }

  @Override
  public String toString() {
    if (id == null) {
      return "{ "
              + "\"name\":"
              + "\""
              + name
              + '\"'
              + ", \"course\":"
              + "\""
              + course
              + '\"'
              + ", \"email\":"
              + "\""
              + email
              + '\"'
              + ", \"age\":"
              + "\""
              + age
              + "\" }";
    } else {
      return "{ " + "\"name\":"
              + '\"' + name + '\"'
              + ", \"score\":"
              + scope
              + " }";
    }
  }
}