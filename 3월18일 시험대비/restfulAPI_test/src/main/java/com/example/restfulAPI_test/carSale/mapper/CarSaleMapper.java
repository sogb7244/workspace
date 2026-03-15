package com.example.restfulAPI_test.carSale.mapper;

import com.example.restfulAPI_test.carSale.dto.CarSaleDTO;
import com.example.restfulAPI_test.carSale.dto.ColorDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CarSaleMapper {

  public void salesReg(CarSaleDTO carSaleDTO);
  public List<ColorDTO> getColor();
  public  List<Map<String, Object>> getSaleListInfo();
}
