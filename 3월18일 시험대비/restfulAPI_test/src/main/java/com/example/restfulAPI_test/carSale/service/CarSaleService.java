package com.example.restfulAPI_test.carSale.service;

import com.example.restfulAPI_test.carSale.dto.CarSaleDTO;
import com.example.restfulAPI_test.carSale.dto.ColorDTO;
import com.example.restfulAPI_test.carSale.mapper.CarSaleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CarSaleService {
  private final CarSaleMapper carSaleMapper;

  public void salesReg(CarSaleDTO carSaleDTO){
    carSaleMapper.salesReg(carSaleDTO);
  }
  public List<ColorDTO> getColor(){ return carSaleMapper.getColor();}
  public List<Map<String, Object>> getSaleListInfo(){ return carSaleMapper.getSaleListInfo();}
}
