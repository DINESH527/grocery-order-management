package com.example.online_grocery.service;
import java.util.List;
import com.example.online_grocery.entity.GroceryItem;


public interface GroceryItemService {
    List<GroceryItem> getAllGroceryItem();
    GroceryItem getGroceryItemById(Long id);
    GroceryItem createGroceryItem(GroceryItem groceryItem);
    GroceryItem updateGroceryItem(Long id, GroceryItem groceryItemDetails);
    void deleteGroceryItem(Long id);

}
