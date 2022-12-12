package com.canada.gorcery.controller;


import com.canada.gorcery.entity.GroceryEntity;

import com.canada.gorcery.services.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GroceryController {


    @Autowired
    GroceryService groceryService;


    /*
     *
     * Get GroceryList API */

    @GetMapping("/getGroceryList")
    public List<GroceryEntity> getGroceryList() {

        List<GroceryEntity> groceryEntityList = groceryService.getGroceryList();;
        return groceryEntityList;
    }

    /*
     *
     * Post AddItem API */

    @PostMapping("/addItem")
    public GroceryEntity addItem(@RequestBody GroceryEntity groceryEntity) {
       return groceryService.saveGroceryItem(groceryEntity);
    }

    /*
     *
     * Post DeleteItem API */

    @DeleteMapping("/deleteItem/{item_id}")
    public List<GroceryEntity> deleteItem(@PathVariable("item_id") int item_id) {
        return groceryService.deleteItemAndLatestList(item_id);
    }

}
