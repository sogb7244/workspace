package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {
  private ReplyMapper replyMapper;

  public ReplyService(ReplyMapper replyMapper){
    this.replyMapper = replyMapper;
  }

  //댓글 목록 조회 기능
  public List<ReplyDTO> getReplyList(int boardNum){
    return replyMapper.selectReplyList(boardNum);
  }
  //댓글 등록 쿼리 실행 메서드
  public void insertReply(ReplyDTO replyDTO) {
     replyMapper.insertReplyBoard(replyDTO);
  }
  //댓글 삭제 쿼리
  public void deleteReply(int replyNum){
    replyMapper.deleteReply(replyNum);
  }

}








