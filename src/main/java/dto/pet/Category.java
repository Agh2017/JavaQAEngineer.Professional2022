package dto.pet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Category {
  @Getter
  private String name;
  @Getter
  private int id;
}