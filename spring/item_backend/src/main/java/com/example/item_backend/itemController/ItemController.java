package com.example.item_backend.itemController;


import com.example.item_backend.itemDTO.ItemDTO;
import com.example.item_backend.itemService.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}


