package com.example.restfulAPI_test.cateCar.service;


import com.example.restfulAPI_test.cateCar.dto.CarsCateDTO;
import com.example.restfulAPI_test.cateCar.mapper.CarsCateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarsCateService {
  private final CarsCateMapper carsCateMapper;

  public List<CarsCateDTO> selectCate(){
    return carsCateMapper.selectCate();
  }
}