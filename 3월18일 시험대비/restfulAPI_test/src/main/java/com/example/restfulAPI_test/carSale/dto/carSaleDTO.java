package com.example.restfulAPI_test.carSale.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@ToString
public class carSaleDTO {
  private int salesNum;
  private String buyerName;
  private String buyerPhone;
  private String color;
  private DateTimeFormat saleDate;
  private int modelNum;
}
