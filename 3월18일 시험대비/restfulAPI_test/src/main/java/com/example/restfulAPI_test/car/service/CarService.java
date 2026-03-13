package com.example.restfulAPI_test.car.service;


import com.example.restfulAPI_test.car.dto.CarDTO;
import com.example.restfulAPI_test.car.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
  private final CarMapper carMapper;

  public List<CarDTO> selectCar(){
    return carMapper.selectCar();
  }
  public void insertCar(CarDTO carDTO){
    carMapper.insertCar(carDTO);
  }
}
