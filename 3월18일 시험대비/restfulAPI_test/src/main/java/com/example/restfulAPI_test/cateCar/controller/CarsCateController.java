package com.example.restfulAPI_test.cateCar.controller;

import com.example.restfulAPI_test.car.dto.CarDTO;
import com.example.restfulAPI_test.cateCar.dto.CarsCateDTO;
import com.example.restfulAPI_test.cateCar.service.CarsCateService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/cars")
@RequiredArgsConstructor
public class CarsCateController {
  private final CarsCateService carsCateService;

  @GetMapping("/categories")
  public ResponseEntity<?> selectCate(){
    try {
      List<CarsCateDTO> list = carsCateService.selectCate();
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch (Exception e){
      log.error("카테고리 api 오류",e);
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
