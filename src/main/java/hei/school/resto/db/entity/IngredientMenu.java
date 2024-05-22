package hei.school.resto.db.entity;

import lombok.Data;

import java.util.List;

@Data
public class IngredientMenu {
    private String id;
    private double quantity;
    private Menu menu;
    private List<IngredientTemplate> ingredient;
}
