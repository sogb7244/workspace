package com.example.restfulAPI_test.carSale.service;

import com.example.restfulAPI_test.carSale.dto.CarSaleDTO;
import com.example.restfulAPI_test.carSale.mapper.CarSaleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarSaleService {
  private final CarSaleMapper carSaleMapper;

  public void carSaleDTO(CarSaleDTO carSaleDTO){
    carSaleMapper.regCarSale(carSaleDTO);
  }
}
