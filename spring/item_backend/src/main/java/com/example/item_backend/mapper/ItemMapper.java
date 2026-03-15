package com.example.item_backend.mapper;

import com.example.item_backend.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ItemMapper {
  //리스트조회
  List<ItemDTO> itemList();
  //상세보기 조회
  List<ItemDTO> itemDetail(ItemDTO itemDTO);
}
