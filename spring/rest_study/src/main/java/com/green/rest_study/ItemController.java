package com.green.rest_study;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
   private List<ItemDTO> itemList;


   public ItemController(){
     itemList = new ArrayList<>();

     itemList.add(new ItemDTO(1,"김","3000","삼성"));
     itemList.add(new ItemDTO(2,"박","5000","르노"));
     itemList.add(new ItemDTO(3,"이","7000","애플"));
     itemList.add(new ItemDTO(4,"최","9000","테슬라"));
     itemList.add(new ItemDTO(5,"최","1000","테슬라"));
   }
   @GetMapping("")
   public List<ItemDTO> getItemList(){
     return itemList;
   }
   @GetMapping("/{num}")
   public ItemDTO getItem(@PathVariable("num") int num){
     ItemDTO result = null;
     for (ItemDTO e : itemList) {
       if (e.getItemNum() == num) {
         result = e;
       }
     }
     return result;
     //num 매개변수로 받아서 itemList e객체에
   }
   @DeleteMapping("/{delNum}")
   public List<ItemDTO> deleteItem(@PathVariable("delNum") int delNum){
     for(int i = 0; i<itemList.size();i++){
       if(itemList.get(i).getItemNum() == delNum){
         itemList.remove(i);
       }
     }
     return itemList;
   }
}
