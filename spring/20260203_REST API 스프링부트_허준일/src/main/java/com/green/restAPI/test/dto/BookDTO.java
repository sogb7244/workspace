package com.green.restAPI.test.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
  private int bookNum;
  private String title;
  private String author;
  private String bookIntro;
  private String price;
}

