package mock.stubs;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import mock.data.Course;
import java.util.ArrayList;
import java.util.List;


public class AllCoursesStub {

  private final String basePath = "/course/get/all";

  {
    registerStubAllCourses();
  }

  private void registerStubAllCourses() {
    List<Course> listCourses = new ArrayList<>();
    listCourses.add(new Course("QA java", 15000));
    listCourses.add(new Course("Java", 12000));

    stubFor(get(urlEqualTo(String.format("%s", basePath)))
            .willReturn(aResponse()
                    .withBody(listCourses.toString())
                    .withStatus(200)));
  }
}
