package dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private List<String> photoUrls;
    private String name;
    private int id;
    private Category category;
    private List<TagsItem> tags;
    private String status;
}