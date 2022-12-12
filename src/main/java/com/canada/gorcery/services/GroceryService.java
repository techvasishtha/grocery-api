package com.canada.gorcery.services;
import com.canada.gorcery.entity.GroceryEntity;
import com.canada.gorcery.repository.GroceryRepository;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public  class GroceryService implements IGroceryService {


    private  final GroceryRepository groceryRepository;


    public GroceryService(GroceryRepository groceryRepository) {
        this.groceryRepository = groceryRepository;
    }


    @Override
    public List<GroceryEntity>getGroceryList() {
        List<GroceryEntity> groceryEntityList = groceryRepository.findByAll();;

        return groceryEntityList;
    }

    @Override
    public GroceryEntity saveGroceryItem(GroceryEntity groceryEntity){
        try {
           // groceryRepository.save(groceryEntity);
            return groceryRepository.save(groceryEntity);
        }
        catch(Exception e){
          //  return "Grocery Item Not Successfully Added";
            return null;
        }
    }

    @Override
    public List<GroceryEntity> deleteItemAndLatestList(int item_id) {
        groceryRepository.deleteById(item_id);
        return getGroceryList();
    }

}
