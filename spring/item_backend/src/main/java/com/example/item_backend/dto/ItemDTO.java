package com.example.item_backend.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

<<<<<<< HEAD:spring/item_backend/src/main/java/com/example/item_backend/dto/ItemDTO.java
import java.util.Date;
=======
import java.time.LocalDateTime;
>>>>>>> 8ed3f59a89fa6ab38752d4b117954fab97919c5f:spring/item_backend/src/main/java/com/example/item_backend/itemDTO/ItemDTO.java

@Getter
@Setter
@ToString
public class ItemDTO {
  private int itemNum;
  private String itemName;
  private int price;
  private String itemRegName;
  private String itemIntro;
<<<<<<< HEAD:spring/item_backend/src/main/java/com/example/item_backend/dto/ItemDTO.java
  private Date itemRegDate;
=======
  private LocalDateTime itemRegDate;
>>>>>>> 8ed3f59a89fa6ab38752d4b117954fab97919c5f:spring/item_backend/src/main/java/com/example/item_backend/itemDTO/ItemDTO.java
}
