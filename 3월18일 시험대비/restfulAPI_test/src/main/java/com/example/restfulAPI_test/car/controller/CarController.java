package com.example.restfulAPI_test.car.controller;

import com.example.restfulAPI_test.car.dto.CarDTO;
import com.example.restfulAPI_test.car.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {
  private final CarService carService;

  @GetMapping("/list")
  public ResponseEntity<?> selectCar(){
    try {
      CarDTO list = carService.selectCar();
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch (Exception e){
      log.error("자동차 관리화면 api 오류",e);
     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
