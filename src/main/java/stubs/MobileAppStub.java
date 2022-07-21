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

        stubFor(get(urlEqualTo("/"))
                .willReturn(aResponse()
                        .withBody(listCourses.toString())
                        .withStatus(200)));
    }
}
