package com.green.board.controller;
import java.sql.SQLOutput;
import java.util.List;
import com.green.board.dto.BoardDTO;
import com.green.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//해당 파일을 요청에 대한 응답 기능을 API로 구현
//응답으로 주로 쿼리 실행을 한다.

//초기세팅
//1. RestController 어노테이션을 클래스 위에 선언
//   객체 생성 + 이 클래스가 요청에 대한 응답을 처리하는 클래스임을 스프링한테 알려줌
// 2. 쿼리 실행 기능 메서드를 호출하기 위해
// 2-1) service 클래스의 객체를 멤버변수로 선언
// 2-2) 생성자 의존성 주입 문법을 사용해서 service 객체를 생성
@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  @Autowired
  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }
  //게시글 목록 조회 api

  @GetMapping
  //(GET) localhost:8080/boards
  public List<BoardDTO> getList(){
    List<BoardDTO> result = boardService.getList();
    return result;
  }
  //게시글 등록 API
  //(POST) localhost:8080/boards
  @PostMapping("")
  public void insert(@RequestBody BoardDTO boardDTO){
    boardService.insertBoard(boardDTO);
    System.out.println(boardDTO);
  }
  //(GET) localhost:8080/boards/get/1 -> 게시글 상세조회
  //(GET) localhost:8080/boards/update/1 -> 수정하기 위한 조회
@GetMapping("/{type}/{boardNum}")
  public BoardDTO getDetailList(@PathVariable("boardNum") int boardNum,
                                @PathVariable("type")String type){
    //type = 'get' : 상세조회, type = 'update' : 수정 페이지어서 조회

    return boardService.getBoardDetail(boardNum, type);
  }

  //게시글 삭제 api
@DeleteMapping("/{boardNum}")
  public void delete(@PathVariable("boardNum")int boardNum){
    boardService.deleteDetail(boardNum);
}
  //게시글 수정 api
  //(PUT) localhost:8080/boards/1
@PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum")int boardNum,@RequestBody BoardDTO boardDTO){
  System.out.println(boardNum);
    System.out.println(boardDTO);
    //boardDTO 에 boardNum을 채워줘야함
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
}

}
