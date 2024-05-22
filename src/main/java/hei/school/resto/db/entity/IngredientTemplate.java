package hei.school.resto.db.entity;

import lombok.Data;

import java.util.List;

@Data
public class IngredientTemplate {
    private String id;
    private String name;
    private double price;
    private Unite unite;
}
