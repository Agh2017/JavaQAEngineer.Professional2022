package utils;

import lombok.Getter;

public enum Constants {
  //коды ответов сервера
  CODE_200("200"),
  CODE_404("404"),
  CODE_CUSTOM(System.getProperty("rest.response.code.custom")),

  //время ответа
  RESPONSE_TIME(System.getProperty("rest.time.less.than.long")),

  //текст сообщения об ошибке, которое будет выведено при проверке параметра message в ответе
  RESPONSE_PARAMETER_MESSAGE("Message is missing"),
  //текст сообщения об ошибке, которое будет выведено при проверке параметра type в ответе
  RESPONSE_PARAMETER_TYPE("Type is missing"),

  //текст сообщения об ошибке, которое будет выведено при проверке кода ответа
  SERVER_MESSAGE("Status code is missing"),

  //Параметры

  CATEGORY_CATS("Cats"),
  CATEGORY_DOGS("Dogs"),
  PARAMETER_CATEGORY_NAME("category.name"),

  PARAMETER_TYPE("type"),
  //ожидаемое значение параметра type в запросе deleteOrder
  EXPECTED_TYPE_DELETE("unknown"),

  PARAMETER_CODE("code"),
  //ожидаемое значение параметра code в запросе deleteOrder
  EXPECTED_TYPE_CODE("1"),

  PARAMETER_MESSAGE("message"),
  //ожидаемое значение параметра message в запросе deleteOrder
  EXPECTED_NOT_FOUND("Order not found"),

  PARAMETER_STATUS("status"),
  PARAMETER_STATUS_FREE("free"),
  PARAMETER_STATUS_RESERVE("reserve"),
  PARAMETER_NAME("name"),
  PARAMETER_ID("id"),
  PARAMETER_PET_ID("petId"),
  PARAMETER_QUANTITY("quantity");

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

