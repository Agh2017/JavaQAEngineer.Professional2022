package stubs;

import data.Course;

import java.util.ArrayList;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class MobileAppStub {

    private final String basePath = "localhost";

    {
        registerMobileAppStub();
    }

    private void registerMobileAppStub() {
        List<Course> listCourses = new ArrayList<>();
        listCourses.add(new Course("QA java", 15000));
        listCourses.add(new Course("Java", 12000));

        stubFor(get(urlEqualTo("/all"))
                .willReturn(aResponse()
                        .withBody(listCourses.toString())
                        .withStatus(200)));
    }
}
/*
Сделать 2 стаба

  @GetMapping(value = "/all")
  public List<UserDto> getAllUsers() {
    List<UserDto> userList = new ArrayList<>();
    userList.add(new UserDto(1, "Thomas Shelby", "78", "St.Patrick's School", "Birmingham"));
    userList.add(new UserDto(2, "John Shelby", "15", "Elementary School", "London"));
    return userList;
  }

  @GetMapping(value = "/{id}")
  public UserDto getSingleUser(@PathVariable("id") int id) {
    return new UserDto(1, "Thomas Shelby", "78", "St.Patrick's School", "Birmingham");
  }
 */