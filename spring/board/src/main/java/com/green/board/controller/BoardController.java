package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//해당 파일을 요청에 대한 응답 기능을 API로 구현
//응답으로 주로 쿼리 실행을 한다.

//초기세팅
// 1. @RestController 어노테이션을 클래스 위에 선언
//    객체 생성 + 이 클래스가 요청에 대한 응답을 처리하는 클래스임을 스프링한테 알려줌
//2. 쿼리 실행 기능 메서드를 호출하기 위해
//2-1) Service 클래스의 객체를 맴버변수로 선언

@Slf4j //모든 로그기록
@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService; //2-1 코드

  public BoardController(BoardService boardService){
    this.boardService = boardService;
  }

  //게시글 목록 조회 api
  //(GET) localhost:8080/boards
  @GetMapping("")
  public ResponseEntity<?> getBoardList(SearchDTO searchDTO){
    try {
      System.out.println(searchDTO);
      log.info("게시글 목록 조회 기능 실행 중");
      List<BoardDTO> list = boardService.getList(searchDTO);
      return ResponseEntity.status(HttpStatus.OK).body(list);
    }catch(Exception e) {
      log.error("게시글 목록 조회 중 오류 발생!!!");
      e.printStackTrace(); //오류나는 이유 및 발생 위치를 알려줌
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("오류났어요");
    }
  }

  //게시글 등록 api
  // (POST) localhost:8080/boards
  @PostMapping("")
  public ResponseEntity<Integer> regBoard(@RequestBody BoardDTO boardDTO){
    try{
      System.out.println(boardDTO);
      int result = boardService.regBoard(boardDTO);
      //등록됐으면 CREATED
      return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }catch (Exception e){
      log.error("게시글 등록 중 오류");
      e.printStackTrace();
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }



  }

  //게시글 상세 조회 api
  // (Get) localhost:8080/boards/get/1 -> 게시글 상세조회
  // (Get) localhost:8080/boards/update/1 -> 수정 하기 위한 조회
  @GetMapping("/{type}/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum,
                           @PathVariable("type") String type){
    //type = 'get' : 상세조회, type = 'update' : 수정 페이지에서 조회
    //return boardService.getBoard(boardNum, type);

    BoardDTO result =  boardService.getBoard(boardNum, type);
    System.out.println(result);
    return result;

  }

  //게시글 삭제 api
  //(DELETE) localhost:8080/boards/1
  @DeleteMapping("/{boardNum}")
  public int deleteBoard(@PathVariable("boardNum") int boardNum){
    int result = boardService.deleteBoard(boardNum);
    return result;
  }

  //게시글 수정 api
  //(PUT) localhost:8080/boards/1
  @PutMapping("/{boardNum}")
  public void updateBoard(@PathVariable("boardNum") int boardNum,
                          @RequestBody BoardDTO boardDTO){
    System.out.println("boardNum = " + boardNum);
    System.out.println(boardDTO);
    boardDTO.setBoardNum(boardNum);
    boardService.updateBoard(boardDTO);
  }

}
//2-2) 생성자 의존성 주입 문법을 사용해서 Service 클래스의 객체를 생성








