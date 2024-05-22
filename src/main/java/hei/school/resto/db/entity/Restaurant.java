package hei.school.resto.db.entity;

import java.util.List;
import java.util.UUID;

public class Restaurant {
    private UUID id;
    private String location;
    private List<Menu> menus;
}
