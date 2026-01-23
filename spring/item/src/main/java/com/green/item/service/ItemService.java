package com.green.item.service;

import com.green.item.dto.ItemDTO;
import com.green.item.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//서비스 : 프로젝트에서 핵심 기능을 구현한 클래스
@Service //객체생성 + 이 클래스에는 핵심 !기능! 있음
public class ItemService {


 ; private ItemMapper itemMapper;
  //  @Autowired 클레스에 생성자가 하나만 존재하면 해당 생성자에 @autowired
  //  어노테이션이 자동으로 붙는다.
  public ItemService(ItemMapper itemMapper) {
    this.itemMapper = itemMapper;

  }

  //상품 등록 기능 실행 메서드
  public void regItem(ItemDTO itemDTO){
    System.out.println("상품 등록 기능을 시작함");
    System.out.println("아래는 상품 등록시 전달되는 데이터");
    //상품 등록 쿼리 실행
    System.out.println("상품등록 쿼리 실행 완료");
    itemMapper.insertItem(itemDTO);
  }
  //상품 목록 조회 기능 메서드
  public List<ItemDTO> getItemList(){
    List<ItemDTO> list = itemMapper.selectItemList();
    return list;
  }
  //selectItemInfo 해야할 차례



}
