package dto;

import lombok.Data;

@Data
public class Category{
    private String name;
    private int id;

    public Category(String name, int id) {
        this.name = name;
        this.id = id;
    }
}