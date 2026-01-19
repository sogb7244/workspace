package com.green.rest_study;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {
  private int itemNum;
  private String itemName;
  private String itemPrice;
  private String itemFirst;
}


