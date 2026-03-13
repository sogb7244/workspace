package com.example.restfulAPI_test.carSale.mapper;

import com.example.restfulAPI_test.carSale.dto.CarSaleDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarSaleMapper {
  public  CarSaleDTO regCarSale(CarSaleDTO carSaleDTO);
}
