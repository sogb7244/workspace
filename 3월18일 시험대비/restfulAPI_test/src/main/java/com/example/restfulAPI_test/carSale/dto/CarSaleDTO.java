package com.example.restfulAPI_test.carSale.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class CarSaleDTO {
  private int salesNum;
  private String buyerName;
  private String buyerTel;
  private String color;
  private LocalDateTime saleDate;
  private int modelNum;
}
