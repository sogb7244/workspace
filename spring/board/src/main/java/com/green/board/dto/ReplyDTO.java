package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ReplyDTO {
  private int replyNum;
  private String writer;
  private String content;
  private LocalDateTime regDate;
  private int boardNum;
}
