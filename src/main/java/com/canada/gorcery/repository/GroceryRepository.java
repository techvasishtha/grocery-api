package com.canada.gorcery.repository;

import com.canada.gorcery.entity.GroceryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;

@Repository
public interface GroceryRepository extends JpaRepository<GroceryEntity, Integer> {

    @Query(value = "Select * FROM Grocery_List", nativeQuery = true)
    List<GroceryEntity> findByAll();

   /* @Query(value = "Delete * FROM Grocery_List at WHERE item_id = ?1 ", nativeQuery = true)
    (long item_id);*/


}
