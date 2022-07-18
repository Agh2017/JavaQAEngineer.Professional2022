Release Notes
-------------

**Jenkins**

Необходимо скачать предложенный фронт и мобильное приложение
Развернуть и настроить selenoid
Развернуть и настроить Jenkins
Настроить отчеты Allure
Написать автотесты на WEB с использованием Cucumber/Selenide
Написать автотесты на Mobile App (android) с использованием Appium
Написать Stub/Mock для Web & Mobile App
Написать API тесты на mock с использованием JsonSchemaValidation
Замокать падающий метод 
Тесты должны запускаться либо по пушу в мастер и по расписанию (каждый день в полночь) Контракты:
GET /users/get/all Возвращает массив объектов [ {'id': int, 'name': String, 'grade': String, }, {'id': int, 'name': String, 'grade': String, }, ]
GET /users/{id} Возвращает объект { 'id': int, 'name': String, 'grade': String, 'school_name': String, 'city': String, }, Дополнительно: Необходимо реализовать слушатель, который будет подсвечивать элементы перед нажатием. В отчет необходимо добавлять видео с прогоном теста.

Installing and Start
--------------------

1. Открыть проект в среде разработки.
2. Настроить maven и JAVA, запустить команду "mvn compile".
3. Запустить в командной строке тесты предварительно указав тестовое окружение:
   Например:
   mvn clean test

Licensing
---------
Please dont see the file called LICENSE.
