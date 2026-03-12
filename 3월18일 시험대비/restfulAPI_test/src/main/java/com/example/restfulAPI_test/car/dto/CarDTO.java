package com.example.restfulAPI_test.car.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarDTO {
  private int modelNum;
  private String modelName;
  private  int price;
  private  String brand;
}
