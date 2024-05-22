package hei.school.resto.db.entity;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Restaurant {
    private UUID id;
    private String location;
    private List<Menu> menus;
}
