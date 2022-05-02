package dto.pet;

import java.util.List;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewPet {
  @Getter
  private List<String> photoUrls;
  @Getter
  private String name;
  @Getter
  private int id;
  @Getter
  private Category category;
  @Getter
  private List<TagsItem> tags;
  @Getter
  private String status;
}