package stubs;

import data.User;
import net.minidev.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;

public class AllUsersStub {
    private final String basePath = "/user/get/all";

    {
        registerStubListUsers();
    }

    private void registerStubListUsers() {
        List<User> listUsers = new ArrayList<>();
        listUsers.add(new User("Yuri N", "QA java", "dont@mail.me", 77, 95));
        listUsers.add(new User("Test user", "QA", "test@test.test", 23, 78));

        Map<String, String> map = listUsers.stream().collect(Collectors.toMap(listUser -> "name", User::getName, (a, b) -> b));

        System.out.println("map");
        System.out.println(new JSONObject(map).toJSONString());
        System.out.println("list");
        System.out.println(listUsers);


        stubFor(get(urlEqualTo(String.format("%s", basePath)))
                .willReturn(aResponse()
                        .withBody(listUsers.toString())
                        .withStatus(200)));
    }

//    endpoints:AZq81
//            /user/get/{id} - для получение оценки пользователя
///cource/get/all - для получения списка курсов
///user/get/all - для получения списка всех пользователей
//
//            Контракты
//
//    Для user { "name":"Test user", "cource":"QA", "email":"test@test.test" "age": 23 }
//    Для оценки: { "name":"Test user", "score": 78 }
//    Для курсов: [ { "name":"QA java", "price": 15000 }, { "name":"Java", "price": 12000 } ]

}
