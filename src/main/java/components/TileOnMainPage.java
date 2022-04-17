package components;

public class TileOnMainPage {

  private String tileName;
  private String startDate;

  public TileOnMainPage(String tileName, String startDate) {
    this.tileName = tileName;
    this.startDate = startDate;
  }

  public String getTileName() {
    return tileName;
  }

  public String getStartDate() { return startDate; }

}
