package com.example.item_backend.controller;


<<<<<<< HEAD:spring/item_backend/src/main/java/com/example/item_backend/controller/ItemController.java
import com.example.item_backend.dto.ItemDTO;
import com.example.item_backend.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import com.example.item_backend.itemDTO.ItemDTO;
import com.example.item_backend.itemService.ItemService;
import org.springframework.web.bind.annotation.*;
>>>>>>> 8ed3f59a89fa6ab38752d4b117954fab97919c5f:spring/item_backend/src/main/java/com/example/item_backend/itemController/ItemController.java

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
  private ItemService itemService;

  public ItemController(ItemService itemService) {
    this.itemService = itemService;
  }
  @GetMapping
  public List<ItemDTO> getList(){
    List<ItemDTO> result = itemService.getList();
            return result;
  }
  @GetMapping("/detail")
  public List<ItemDTO> getDetail(ItemDTO itemDTO){
    List<ItemDTO> result = itemService.getDetail(itemDTO);
            return result;
  }
  @GetMapping("/{itemNum}")
  public  ItemDTO getDetail(@PathVariable("itemNum") Integer num){
    ItemDTO result = itemService.getDetail(num);
    return result;
  }
  @PutMapping("/update")
  public void updateDetail(@RequestBody ItemDTO itemDTO){
    itemService.update1(itemDTO);
  }
  @DeleteMapping("/detail/{num}")
  public void deleteDetail(@PathVariable("num") int num){
    itemService.deleteDetail(num);
  }
  @PostMapping("/reg")
  public void insertData(@RequestBody ItemDTO itemDTO){
    itemService.insertData(itemDTO);
  }
}


