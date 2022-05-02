package dto.pet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Category {
  @Getter
  private String name;
  @Getter
  private int id;

  @Override
  public String toString() {
    return "{" +
            "id=" + id +
            ", name=" + name +
            '}';
  }
}