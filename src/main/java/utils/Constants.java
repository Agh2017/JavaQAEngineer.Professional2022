package utils;

import lombok.Getter;

public enum Constants {
  CODE_200("200"),
  CODE_404("404"),
  CODE_CUSTOM(System.getProperty("rest.response.code.custom")),
  RESPONSE_TIME(System.getProperty("rest.time.less.than.long")),
  EXPECTED_TYPE_DELETE("unknown"),
  EXPECTED_NOT_FOUND("Order not found");

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

