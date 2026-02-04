package com.green.board.controller;

import com.green.board.dto.ReplyDTO;
import com.green.board.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replies")
public class ReplyController {
  private ReplyService replyService;

  public ReplyController(ReplyService replyService){
    this.replyService = replyService;
  }

  //댓글 목록 조회 api
  //(GET) localhost:8080/replies/3
  @GetMapping("/{boardNum}")
  public List<ReplyDTO> getReplyList(@PathVariable("boardNum") int boardNum){
    //조회되는 데이터가 없어도 list는 null이 아니고, size() 메서드 결과 0이 나옴
    List<ReplyDTO> list = replyService.getReplyList(boardNum);
    return list;
  }
  //댓글 입력 api
  //(POST) localhost:8080/replies
  @PostMapping
  public void insertReply(@RequestBody ReplyDTO replyDTO){
    replyService.insertReply(replyDTO);
  }
  @DeleteMapping("/{replyNum}")
  public void deleteReply(@PathVariable("replyNum")int deleteNum){
    replyService.deleteReply(deleteNum);
  }

}











