package com.canada.gorcery.services;

import com.canada.gorcery.entity.GroceryEntity;

import java.util.List;

public  interface IGroceryService {

    GroceryEntity saveGroceryItem(GroceryEntity groceryEntity);

    List<GroceryEntity> getGroceryList();

    List<GroceryEntity> deleteItemAndLatestList(int item_id);

}
