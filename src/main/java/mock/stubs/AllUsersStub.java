package mock.stubs;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import mock.data.User;
import java.util.ArrayList;
import java.util.List;


public class AllUsersStub {
  private final String basePath = "/user/get/all";

  {
    registerStubListUsers();
  }

  private void registerStubListUsers() {
    List<User> listUsers = new ArrayList<>();
    listUsers.add(new User("Yuri N", "QA java", "dont@mail.me", 77, 95));
    listUsers.add(new User("Test user", "QA", "test@test.test", 23, 78));

    stubFor(get(urlEqualTo(String.format("%s", basePath)))
            .willReturn(aResponse()
                    .withBody(listUsers.toString())
                    .withStatus(200)));
  }
}
