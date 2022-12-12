package com.canada.gorcery.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;


import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="Grocery_List")

public class GroceryEntity {

    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_id_generator")
    @SequenceGenerator(name="item_id_generator", initialValue = 1, allocationSize = 1,sequenceName = "item_id_seq")
    private int itemId;

    @Column(name="item_name")
    private String itemName;

    @Column(name="notes")
    private String notes;

    @Column(name="item_purchased")
    private String itemPurchased;


    @Column(name="created_date")
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date createdDate;


    public GroceryEntity(String itemName,String notes,String itemPurchased, Date createdDate) {
        this.itemName = itemName;
        this.notes = notes;
        this.itemPurchased = itemPurchased;
        this.createdDate = createdDate;
    }

    public GroceryEntity() {
    }



}
