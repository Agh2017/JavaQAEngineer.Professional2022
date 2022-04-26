package dto.store;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
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