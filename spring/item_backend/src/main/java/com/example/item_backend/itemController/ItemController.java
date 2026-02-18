package com.example.item_backend.itemController;


import com.example.item_backend.itemDTO.ItemDTO;
import com.example.item_backend.itemService.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
  private ItemService itemService;

  public ItemController(ItemService itemService) {
    this.itemService = itemService;
  }
  @GetMapping
  public List<ItemDTO> getList(ItemDTO itemDTO){
    List<ItemDTO> result = itemService.getList(itemDTO);
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


