package com.example.restfulAPI_test.cateCar.mapper;


import com.example.restfulAPI_test.cateCar.dto.CarsCateDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarsCateMapper {
  public List<CarsCateDTO> selectCate();
}
