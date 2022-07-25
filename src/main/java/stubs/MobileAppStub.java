package stubs;

import data.Course;
import data.Schoolboy;

import java.util.ArrayList;
import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class MobileAppStub {

    private final String basePath = "/user/get/all";

    {
        registerMobileAppStub();
    }

    private void registerMobileAppStub() {
        List<Schoolboy> listTrainees = new ArrayList<>();
        listTrainees.add(new Schoolboy(1,"Thomas Shelby", 78, "St.Patrick's School", "Birmingham"));
        listTrainees.add(new Schoolboy(2, "John Shelby", 15,"Elementary School", "London"));

        stubFor(get(urlEqualTo(String.format("%s", basePath)))
                .willReturn(aResponse()
                        .withBody(listTrainees.toString())
                        .withStatus(200)));
        System.out.println("=============== stub ON /user/get/all  ===============");
    }
}
/*
Сделать 2 стаба


(value = "/{id}")
(1, "Thomas Shelby", "78", "St.Patrick's School", "Birmingham");
  }
 */