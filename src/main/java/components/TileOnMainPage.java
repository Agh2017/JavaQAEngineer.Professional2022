package components;

import java.time.LocalDate;

public class TileOnMainPage {

  private final String tileName;
  private final LocalDate startDate;

  public TileOnMainPage(String tileName, LocalDate startDate) {
    this.tileName = tileName;
    this.startDate = startDate;
  }

  public String getTileName() {
    return tileName;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  @Override
  public String toString() {
    return "\"" + tileName
            + "\"";
  }
}
