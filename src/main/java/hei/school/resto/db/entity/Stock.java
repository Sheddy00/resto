package hei.school.resto.db.entity;


import java.time.LocalDateTime;
import java.util.List;

public class Stock {
    private String id;
    private String type;
    private double quantity;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<IngredientTemplate> ingredientTemplates;
}
