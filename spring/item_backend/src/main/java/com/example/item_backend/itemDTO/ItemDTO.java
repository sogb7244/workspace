package com.example.item_backend.itemDTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter
@ToString
public class ItemDTO {
  private int itemNum;
  private String itemName;
  private int price;
  private String itemRegName;
  private String itemIntro;
  private DateTimeFormat itemRegDate;
}
