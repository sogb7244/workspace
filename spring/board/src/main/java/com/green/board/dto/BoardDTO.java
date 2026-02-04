package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

//DTO(Data Transfer Object) : 데이터 전송 객체
//spring과 Basic_board 테이블의 데이터를 주고 받을 수 있는 객체
//Basic_board 테이블의 컬럼정보를 저장할 수 있는 맴버변수를 생성
//맴버변수는 반드시 테이블의 컬럼명을 기준으로 생성
@Setter
@Getter
@ToString
public class BoardDTO {
  private int boardNum; //BOARD_NUM -> boardNum
  private String title;
  private String writer;
  private String content;
  private int readCnt;
  private LocalDateTime createDate;
}
