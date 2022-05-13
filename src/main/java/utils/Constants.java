package utils;

import lombok.Getter;

public enum Constants {
  //коды ответов сервера
  CODE_200("200"),
  CODE_404("404"),
  CODE_CUSTOM(System.getProperty("rest.response.code.custom")),

  //время ответа
  RESPONSE_TIME(System.getProperty("rest.time.less.than.long")),
  //ожидаемое значение параметра type в запросе deleteOrder
  EXPECTED_TYPE_DELETE("unknown"),
  //ожидаемое значение параметра message в запросе deleteOrder
  EXPECTED_NOT_FOUND("Order not found"),
  //текст сообщения об ошибке, которое будет выведено при проверке кода ответа
  SERVER_MESSAGE("Status code is missing"),
  //текст сообщения об ошибке, которое будет выведено при проверке параметра message в ответе
  RESPONSE_PARAMETER_MESSAGE("Message is missing"),
  //текст сообщения об ошибке, которое будет выведено при проверке параметра type в ответе
  RESPONSE_PARAMETER_TYPE("Type is missing"),

  //сами параметры
  PARAMETER_TYPE("type"),
  PARAMETER_CODE("code"),
  PARAMETER_MESSAGE("message"),
  PARAMETER_STATUS("status");

  @Getter
  private final String value;

  public int getIntValue() {
    return Integer.parseInt(value);
  }

  public long getLongValue() {
    return Long.parseLong(value);
  }

  Constants(String value) {
    this.value = value;
  }
}

