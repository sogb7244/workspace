package com.example.restfulAPI_test.car.mapper;

import com.example.restfulAPI_test.car.dto.CarDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper {
  //등록 차량 조회
  public List<CarDTO> selectCar();
  //차량 등록
  public void insertCar(CarDTO carDTO);
  public List<CarDTO> getCarModelList();
}
