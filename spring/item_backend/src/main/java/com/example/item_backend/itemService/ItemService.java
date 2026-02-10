package com.example.item_backend.itemService;

import com.example.item_backend.itemDTO.ItemDTO;
import com.example.item_backend.itemMapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService {
  private ItemMapper itemMapper;

  public ItemService(ItemMapper itemMapper){
    this.itemMapper = itemMapper;
  }
  public List<ItemDTO> getList(ItemDTO itemDTO){
    List<ItemDTO> result = itemMapper.getItemList(itemDTO);
    return result;
  }
}
