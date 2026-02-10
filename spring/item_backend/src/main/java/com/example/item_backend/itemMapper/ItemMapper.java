package com.example.item_backend.itemMapper;

import com.example.item_backend.itemDTO.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ItemMapper {
  List<ItemDTO> List(ItemDTO itemDTO);
}
