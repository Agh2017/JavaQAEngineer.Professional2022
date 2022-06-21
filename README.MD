Wiremock
-

Реализован Stub сервер со следующими методами-заглушками:
- получение списка пользователей
- получение списка курсов
- оценка пользователя

endpoints:
/user/get/{id} - для получение оценки пользователя
/cource/get/all - для получения списка курсов
/user/get/all - для получения списка всех пользователей 

Контракты 

Для user { "name":"Test user", "cource":"QA", "email":"test@test.test" "age": 23 } 
Для оценки: { "name":"Test user", "score": 78 } 
Для курсов: { "name":"QA java", "price": 15000 }, { "name":"Java", "price": 12000 } 

Реализованы тесты для проверки json-cхем:
    * list_courses_path_via_stub_wiremock;
    * users_score_path_via_stub_wiremock;
    * list_users_path_via_stub_wiremock.

Подключить stub frontend,

Докер: docker run -it --rm -d -p 9080:8080 wiremock/wiremock