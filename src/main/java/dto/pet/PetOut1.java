package dto.pet;

import java.util.List;

import lombok.Data;

@Data
public class PetOut1{
    private List<String> photoUrls;
    private String name;
    private long id;
    private Category category;
    private List<TagsItem> tags;
    private String status;
}