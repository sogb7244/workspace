package com.example.restfulAPI_test.car.mapper;

import com.example.restfulAPI_test.car.dto.CarDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarMapper {
  public CarDTO selectCar();
}
