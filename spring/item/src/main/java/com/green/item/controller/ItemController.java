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
  //상품 상세 정보 조회 api
  //(GET)
  @GetMapping("/{itemNum}")
  public ItemDTO getDetail(@PathVariable("itemNum")int itemNum){
      ItemDTO result = itemService.getDetail(itemNum);
    System.out.println(result);
      return result;
  }
  //상품 정보 수정
  @PutMapping("/{itemNum}")
  public void update(@PathVariable("itemNum")int itemNum, @RequestBody ItemDTO itemDTO){
    System.out.println(itemNum);
    System.out.println(itemDTO);
    itemService.updateDate(itemDTO);
  }
  @DeleteMapping("/{itemNum}")
  public void deleteItem(@PathVariable("itemNum")int itemNum){
      itemService.deleteItem(itemNum);
  }
}
