package com.example.online_grocery.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.online_grocery.exeception.ResourceNotFoundException;
import com.example.online_grocery.entity.GroceryItem;
import com.example.online_grocery.repository.GroceryItemRepository;
import com.example.online_grocery.service.GroceryItemService;
@Service
public class GroceryItemServiceImpl  implements GroceryItemService {
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    @Override
    public List<GroceryItem> getAllGroceryItem() {
        return groceryItemRepository.findAll();
    }

    @Override
    public GroceryItem getGroceryItemById(Long id) {
        return groceryItemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + id));
    }

    @Override
    public GroceryItem createGroceryItem(GroceryItem groceryItem) {
        return groceryItemRepository.save(groceryItem);
    }

    @Override
    public GroceryItem updateGroceryItem(Long id, GroceryItem groceryItemDetails) {
        GroceryItem groceryItem = getGroceryItemById(id);
        groceryItem.setName(groceryItemDetails.getName());
        groceryItem.setPrice(groceryItemDetails.getPrice());
        return groceryItemRepository.save(groceryItem);
    }

    @Override
    public void deleteGroceryItem(Long id) {
        GroceryItem groceryItem = getGroceryItemById(id);
        groceryItemRepository.delete(groceryItem);
    }

}
