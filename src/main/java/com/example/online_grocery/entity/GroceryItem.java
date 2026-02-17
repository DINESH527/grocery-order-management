package  com.example.online_grocery.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "grocery_item")
@Data
public class GroceryItem {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "grocery_name")
    private String name;
    private String category;
    private double price;
    private int quantity;

}