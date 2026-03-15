package com.example.item_backend.service;

import com.example.item_backend.dto.ItemDTO;
import com.example.item_backend.mapper.ItemMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService {
  private ItemMapper itemMapper;

  public ItemService(ItemMapper itemMapper){

    this.itemMapper = itemMapper;
  }
  public List<ItemDTO> getList(){
    List<ItemDTO> result = itemMapper.itemList();
    return result;
  }
  public List<ItemDTO> getDetail(ItemDTO itemDTO){
    List<ItemDTO> result = itemMapper.itemDetail(itemDTO);
    return result;
  }
}
