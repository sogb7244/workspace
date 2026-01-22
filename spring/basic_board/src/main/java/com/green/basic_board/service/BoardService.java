package com.green.basic_board.service;


import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Service 클래스 : 프로젝트에서 핵심 기능을 구현한 클래스
//지금은 DB기능을 핵심기능이라 생각.
@Service //객체 생성
public class BoardService {
  //쿼리 실행 추상메서드가 존재하는 객체를 선언
  private BoardMapper boardMapper;

  //생성자 의존성 주입
  @Autowired
  public BoardService(BoardMapper boardMapper){

    this.boardMapper = boardMapper;
  }
  //Mapper interface에서 만든 test1() 추상메서드를 실행하는 메서드
  public String runTest1(){
    String result = boardMapper.test1();
    return result;
  }
  //Mapper interface에 정의된 test1()을 실행할 메서드
  public List<Integer> runTest2(){
    List<Integer> result = boardMapper.test2();
    return result;
  }
  public BoardDTO runTest3(int boardNum){
   BoardDTO result = boardMapper.test3(boardNum);
   return result;
  }
  public List<BoardDTO> runTest4(BoardDTO boardDTO){
   List<BoardDTO> result = boardMapper.test4(boardDTO);
   return result;
  }
}

