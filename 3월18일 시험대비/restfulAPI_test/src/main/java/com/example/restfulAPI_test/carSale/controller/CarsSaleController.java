package com.example.restfulAPI_test.carSale.controller;

import com.example.restfulAPI_test.carSale.dto.CarSaleDTO;
import com.example.restfulAPI_test.carSale.dto.ColorDTO;
import com.example.restfulAPI_test.carSale.service.CarSaleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RequestMapping("/cars")
@RestController
@RequiredArgsConstructor
public class CarsSaleController {
    private final CarSaleService carSaleService;

    @PostMapping("/sale")
    public ResponseEntity<?> salesReg(@RequestBody CarSaleDTO carSaleDTO){
        try {
            carSaleService.salesReg(carSaleDTO);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            log.error("자동차 등록 api 오류",e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/color")
    public ResponseEntity<?> getcolor(){
        try {
            List<ColorDTO> color = carSaleService.getColor();
            return ResponseEntity.status(HttpStatus.OK).body(color);
        }catch (Exception e){
            log.error("자동차 등록 api 오류",e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping("/sale-list")
    public ResponseEntity<?> getSaleListInfo(){
        try {
            List<Map<String, Object>> color = carSaleService.getSaleListInfo();
            return ResponseEntity.status(HttpStatus.OK).body(color);
        }catch (Exception e){
            log.error("판매목록 조회 api 오류",e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
