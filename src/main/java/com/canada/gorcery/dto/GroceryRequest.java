package com.canada.gorcery.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public  class GroceryRequest {

    private int accountNumber;
    private String transType;
    private Date startDate;
    private Date endDate;

}
