package restassured.dto.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class GetOrder {
  @Getter
  private int petId;
  @Getter
  private int quantity;
  @Getter
  private int id;
  @Getter
  private String shipDate;
  @Getter
  private boolean complete;
  @Getter
  private String status;
}
