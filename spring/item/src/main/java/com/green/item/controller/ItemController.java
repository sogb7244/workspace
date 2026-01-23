package com.green.item.controller;

import com.green.item.dto.ItemDTO;
import com.green.item.service.ItemService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //객체생성 + controller 역할
@RequestMapping("/items")
public class ItemController {
    private ItemService itemService;

    public  ItemController(ItemService itemService){
      this.itemService = itemService;
    }
    @PostMapping("")
    public void regItem(@RequestBody ItemDTO itemDTO){
      itemService.regItem(itemDTO);
  }
//상품 목록 조회 API
// (GET)
  @GetMapping("")
  public List<ItemDTO> getItemList(){
      List<ItemDTO> lst = itemService.getItemList();
      return lst;
  }
}
