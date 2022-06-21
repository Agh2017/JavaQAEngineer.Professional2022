package restassured.dto.pet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class TagsItem {
  @Getter
  private String name;
  @Getter
  private int id;
}