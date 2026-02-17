package com.example.online_grocery.dto;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private  Long CustomerId;
    private  List<Long> groceryItemIds;

}
