package com.example.restfulAPI_test.car.service;


import com.example.restfulAPI_test.car.dto.CarDTO;
import com.example.restfulAPI_test.car.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
  private final CarMapper carMapper;

  public CarDTO selectCar(){
    return carMapper.selectCar();
  }
}
