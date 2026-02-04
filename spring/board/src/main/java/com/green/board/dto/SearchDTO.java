package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//검색 내용을 쿼리문으로 전달할 객체
@Setter
@Getter
@ToString
public class SearchDTO {
  private String searchKeyword;
  private String searchValue;
}
